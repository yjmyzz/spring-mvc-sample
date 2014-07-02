package jimmy.mvc.enums;

public enum HOBBY {
	/**
	 * 运动
	 */
	Sports("0", "运动"),
	/**
	 * 音乐
	 */
	Music("1", "音乐"),
	/**
	 * 文学
	 */
	Literature("2", "文学"),
	/**
	 * 睡觉
	 */
	Sleep("3", "睡觉"),
	/**
	 * 购物
	 */
	Shopping("4", "购物");

	private final String value;
	private final String description;

	private HOBBY(String value, String desc) {
		this.value = value;
		this.description = desc;
	}

	public String getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return this.value;
	}

}
