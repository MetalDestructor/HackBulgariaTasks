package pair;

public class Pair {
	private final Object member1;
	private final Object member2;

	public Pair(Object member1, Object member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}

	public Object getMember1() {
		return member1;
	}

	public Object getMember2() {
		return member2;
	}

	public String toString() {
		String obj = String.valueOf(getMember1()) + getMember2();
		return obj;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == member1 && obj == member2)
			return true;
		else
			return false;
	}

}
