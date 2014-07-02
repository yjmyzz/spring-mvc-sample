package jimmy.mvc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Person implements Serializable {

	private static final long serialVersionUID = -3242744250079311107L;

	private String firstName;
	private String lastName;

	private Date birthday;
	private int age;
	private List<String> friends;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
