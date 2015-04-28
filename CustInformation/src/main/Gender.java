package main;

public enum Gender {
	MALE (0),
	FEMALE (1);
	
	private final int gender;
	Gender(int gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		switch (this) {
		case MALE:
			return "Male";
		case FEMALE:
			return "Female";
		default:
			return "Male";
		}
	}
	
	public int getGenderValue() {
		return gender;
	}
}
