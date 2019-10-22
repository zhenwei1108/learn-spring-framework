package com.zhenwei.spring.learing.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;
import java.util.List;

/**
* @file: User.java
* @Package User
* @author: zhenwei
* @Description:  使用LomBok 无效
* @date: 2019/10/15 22:43
*/
public class User implements Serializable {


	private static final long serialVersionUID = 1L;

	private String userName;

	private String password;

	private List<String> likes;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", likes=" + likes +
				'}';
	}
}
