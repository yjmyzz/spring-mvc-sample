package jimmy.mvc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jimmy.mvc.enums.DEGREE;
import jimmy.mvc.enums.SEX;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8677322213172534890L;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 生日
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	/**
	 * 网龄
	 */
	private Integer networkAge;

	/**
	 * 是否VIP（注：Boolean类型的成员，不要用is开头，否则SpringMVC UI上CheckBox无法自动绑定初始值）
	 */
	private Boolean isVip;

	/**
	 * 性别
	 */
	private SEX sex;

	/**
	 * 兴趣爱好
	 */
	private List<String> hobbies;

	/**
	 * 学历
	 */
	private DEGREE degree;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passWord) {
		this.password = passWord;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getNetworkAge() {
		return networkAge;
	}

	public void setNetworkAge(Integer networkAge) {
		this.networkAge = networkAge;
	}



	public SEX getSex() {
		return sex;
	}

	public void setSex(SEX sex) {
		this.sex = sex;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public DEGREE getDegree() {
		return degree;
	}

	public void setDegree(DEGREE degree) {
		this.degree = degree;
	}

	public Boolean getIsVip() {
		return isVip;
	}

	public void setIsVip(Boolean isVip) {
		this.isVip = isVip;
	}

}
