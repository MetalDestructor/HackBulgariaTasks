package cars;

public class Volkswagen extends Car {

	@Override
	boolean isEcoFriendly(boolean testing) {
		if (testing)
			return true;
		else
			return false;
	}

}
