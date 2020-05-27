package com.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user_income_track database table.
 * 
 */

@Entity
@Table(name="user_income_track")
@NamedQuery(name="UserIncomeTrack.findAll", query="SELECT u FROM UserIncomeTrack u")
public class UserIncomeTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_income_id")
	private int userIncomeId;

	private double amount;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date_time")
	private Date createdDateTime;

	private String description;

	@Column(name="income_id")
	private int incomeId;

	@Column(name="updated_by")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date_time")
	private Date updatedDateTime;

	@Column(name="user_id1")
	private int userId1;

	//bi-directional many-to-one association to CategoriesMaster
	@OneToMany(mappedBy="userIncomeTrack")
//	@JoinColumn(name = "category_id", nullable = false)
	private List<CategoriesMaster> categoriesMasters;

	//bi-directional many-to-one association to SubCatagoriesMaster
	@OneToMany(mappedBy="userIncomeTrack")
//	@JoinColumn(name = "sub_category_id", nullable = false)
	private List<SubCatagoriesMaster> subCatagoriesMasters;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="userIncomeTrack")
//	@JoinColumn(name = "user_id", nullable = false)
	private List<User> users;

	public UserIncomeTrack() {
	}

	public int getUserIncomeId() {
		return this.userIncomeId;
	}

	public void setUserIncomeId(int userIncomeId) {
		this.userIncomeId = userIncomeId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIncomeId() {
		return this.incomeId;
	}

	public void setIncomeId(int incomeId) {
		this.incomeId = incomeId;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDateTime() {
		return this.updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public int getUserId() {
		return this.userId1;
	}

	public void setUserId(int userId) {
		this.userId1 = userId;
	}

	public List<CategoriesMaster> getCategoriesMasters() {
		return this.categoriesMasters;
	}

	public void setCategoriesMasters(List<CategoriesMaster> categoriesMasters) {
		this.categoriesMasters = categoriesMasters;
	}

	public CategoriesMaster addCategoriesMaster(CategoriesMaster categoriesMaster) {
		getCategoriesMasters().add(categoriesMaster);
		categoriesMaster.setUserIncomeTrack(this);

		return categoriesMaster;
	}

	public CategoriesMaster removeCategoriesMaster(CategoriesMaster categoriesMaster) {
		getCategoriesMasters().remove(categoriesMaster);
		categoriesMaster.setUserIncomeTrack(null);

		return categoriesMaster;
	}

	public List<SubCatagoriesMaster> getSubCatagoriesMasters() {
		return this.subCatagoriesMasters;
	}

	public void setSubCatagoriesMasters(List<SubCatagoriesMaster> subCatagoriesMasters) {
		this.subCatagoriesMasters = subCatagoriesMasters;
	}

	public SubCatagoriesMaster addSubCatagoriesMaster(SubCatagoriesMaster subCatagoriesMaster) {
		getSubCatagoriesMasters().add(subCatagoriesMaster);
		subCatagoriesMaster.setUserIncomeTrack(this);

		return subCatagoriesMaster;
	}

	public SubCatagoriesMaster removeSubCatagoriesMaster(SubCatagoriesMaster subCatagoriesMaster) {
		getSubCatagoriesMasters().remove(subCatagoriesMaster);
		subCatagoriesMaster.setUserIncomeTrack(null);

		return subCatagoriesMaster;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setUserIncomeTrack(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setUserIncomeTrack(null);

		return user;
	}

	public UserIncomeTrack(int userIncomeId, double amount, String createdBy, Date createdDateTime, String description,
			int incomeId, String updatedBy, Date updatedDateTime, int userId, List<CategoriesMaster> categoriesMasters,
			List<SubCatagoriesMaster> subCatagoriesMasters, List<User> users) {
		super();
		this.userIncomeId = userIncomeId;
		this.amount = amount;
		this.createdBy = createdBy;
		this.createdDateTime = createdDateTime;
		this.description = description;
		this.incomeId = incomeId;
		this.updatedBy = updatedBy;
		this.updatedDateTime = updatedDateTime;
		this.userId1 = userId;
		this.categoriesMasters = categoriesMasters;
		this.subCatagoriesMasters = subCatagoriesMasters;
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserIncomeTrack [userIncomeId=" + userIncomeId + ", amount=" + amount + ", createdBy=" + createdBy
				+ ", createdDateTime=" + createdDateTime + ", description=" + description + ", incomeId=" + incomeId
				+ ", updatedBy=" + updatedBy + ", updatedDateTime=" + updatedDateTime + ", userId=" + userId1
				+ ", categoriesMasters=" + categoriesMasters + ", subCatagoriesMasters=" + subCatagoriesMasters
				+ ", users=" + users + "]";
	}
	
	
	
	
	

}