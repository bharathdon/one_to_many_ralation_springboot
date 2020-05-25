package com.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import java.math.BigInteger;


/**
 * The persistent class for the user database table.
 * 
 */

@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private int userId;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	private BigInteger mobile;

	private String password;

	private String salt;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-one association to UserIncomeTrack
	@ManyToOne(optional = true)
	@JoinColumn(name="user_id",insertable = false,updatable = false)
	private UserIncomeTrack userIncomeTrack;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public BigInteger getMobile() {
		return this.mobile;
	}

	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserIncomeTrack getUserIncomeTrack() {
		return this.userIncomeTrack;
	}

	public void setUserIncomeTrack(UserIncomeTrack userIncomeTrack) {
		this.userIncomeTrack = userIncomeTrack;
	}

	public User(int userId, String email, String firstName, String lastName, String middleName, BigInteger mobile,
			String password, String salt, String userName, UserIncomeTrack userIncomeTrack) {
		super();
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.mobile = mobile;
		this.password = password;
		this.salt = salt;
		this.userName = userName;
		this.userIncomeTrack = userIncomeTrack;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", mobile=" + mobile + ", password=" + password + ", salt=" + salt
				+ ", userName=" + userName + ", userIncomeTrack=" + userIncomeTrack + "]";
	}

	
	
}