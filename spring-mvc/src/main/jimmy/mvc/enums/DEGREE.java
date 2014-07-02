package jimmy.mvc.enums;

public enum DEGREE {

	Bachelor("1", "本科"), Master("2", "硕士"), Doctor("3", "博士");

	private final String value;

	private final String description;

	private DEGREE(String v, String desc) {
		this.value = v;
		this.description = desc;
	}

	public String getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	public static DEGREE get(String strValue) {
		for (DEGREE e : values()) {
			if (e.getValue().equals(strValue)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
