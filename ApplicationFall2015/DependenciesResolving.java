import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Vector;
import java.net.URL;


public class DependenciesResolving {
	private String[] availablePackages;
	private Packages all;
	private Packages dependencies;
	private final String installedModulesPath = "\\modules\\installed_modules";

	public DependenciesResolving(Packages all, Packages dependencies) {
		this.all = all;
		this.dependencies = dependencies;
		init();
	}

	public void init() {
		checkInstalled();
		checkDependencies();
	}

	private void checkInstalled() {
		File folder = new File(installedModulesPath);
		availablePackages = folder.list();
	}

	private void checkDependencies() {
		HashMap tempIndex = dependencies.getIndex();
		String[] temp = tempIndex.get("dependencies").toString().split(" ");
		checkDependenciesRecursively(temp);
		System.out.println("All done.");
	}

	private void checkDependenciesRecursively(String[] key) {
		for (String dependency : key) {
			if (!findInAvailablePackages(dependency)) {
				checkInAllPackages(dependency);
			} else {
				System.out.println(dependency + " is already installed.");
			}
		}
	}

	private boolean findInAvailablePackages(String dependency) {
		for (String avPackage : availablePackages) {
			if (avPackage.equals(dependency))
				return true;
		}
		return false;
	}

	private void checkInAllPackages(String packageName) {
		HashMap tempIndex = all.getIndex();
		String currentDependencies = tempIndex.get(packageName).toString();
		String[] temp = currentDependencies.split(" ");

		System.out.println("Installing " + packageName + ".");
		install(packageName);

		if (!temp[0].equals("")) {
			System.out.println("In order to install " + packageName + ", we need " + currentDependencies + ".");
			checkDependenciesRecursively(temp);
		}
	}

	private void install(String packageName) {
		File dir = new File(installedModulesPath + "\\" + packageName);
		dir.mkdir();
	}

	public static void main(String[] args) {
		Packages allPackages = new Packages("modules/all_packages.json");
        Packages dependencies = new Packages("modules/dependencies.json");
        DependenciesResolving dependenciesTool = new DependenciesResolving(allPackages, dependencies);
	}

}

class Packages {
	private String packages = "";
	private HashMap<String, String> index = new HashMap<>();

	public Packages(String packages) {
		this.packages = packages;
		initIndex();
	}

	public HashMap getIndex() {
		return (HashMap) index.clone();
	}

	private void initIndex() {
		Vector<String> file = readFile();
		Vector<String> temp = new Vector<>();
		for (int i = 0; i < file.size(); i++) {
			temp.add(file.get(i).replaceAll("(\\\"|\\'|\\,|\\[|\\]|\\{|\\})", ""));
			addKeyValue(temp.get(i).trim());
		}
	}

	private Vector<String> readFile() {
		URL url = getClass().getResource(packages);
		Vector<String> jsonArr = new Vector<>();
		try {
			File file = new File(url.toURI());
			BufferedReader bufferReader = new BufferedReader(new FileReader(file));
			String line = bufferReader.readLine();
			while (line != null) {
				jsonArr.add(line);
				line = bufferReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonArr;
	}

	private void addKeyValue(String pair) {
		if (pair.length() > 1) {
			String[] pairArr = pair.split(":");
			String key = pairArr[0].trim();
			String value = pairArr.length > 1 ? pairArr[1].trim() : "";
			index.put(key, value);
			// System.out.println(key + " : " + value);
		}
	}
}
