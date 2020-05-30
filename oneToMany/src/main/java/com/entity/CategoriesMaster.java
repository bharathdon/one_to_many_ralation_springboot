package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the categories_master database table.
 * 
 */


@Entity
@Table(name="categories_master")
@NamedQuery(name="CategoriesMaster.findAll", query="SELECT c FROM CategoriesMaster c")
public class CategoriesMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private int categoryId;

	@Column(name="category_color")
	private String categoryColor;

	@Column(name="category_name")
	private String categoryName;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date_time")
	private Date createdDateTime;

	@Column(name="is_public")
	private byte isPublic;

	@Column(name="updated_by")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date_time")
	private Date updatedDateTime;

	//bi-directional many-to-one association to UserIncomeTrack
	@ManyToOne(optional = false,cascade = CascadeType.ALL)
	@JoinColumn(name="category_id",insertable = false,updatable = false)
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	@NotFound(action = NotFoundAction.IGNORE)

	private UserIncomeTrack userIncomeTrack;

	public CategoriesMaster() {
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryColor() {
		return this.categoryColor;
	}

	public void setCategoryColor(String categoryColor) {
		this.categoryColor = categoryColor;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public byte getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(byte isPublic) {
		this.isPublic = isPublic;
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

	public UserIncomeTrack getUserIncomeTrack() {
		return this.userIncomeTrack;
	}

	public void setUserIncomeTrack(UserIncomeTrack userIncomeTrack) {
		this.userIncomeTrack = userIncomeTrack;
	}

	public CategoriesMaster(int categoryId, String categoryColor, String categoryName, String createdBy,
			Date createdDateTime, byte isPublic, String updatedBy, Date updatedDateTime) {
		super();
		this.categoryId = categoryId;
		this.categoryColor = categoryColor;
		this.categoryName = categoryName;
		this.createdBy = createdBy;
		this.createdDateTime = createdDateTime;
		this.isPublic = isPublic;
		this.updatedBy = updatedBy;
		this.updatedDateTime = updatedDateTime;
//		this.userIncomeTrack = userIncomeTrack;
	}

	@Override
	public String toString() {
		return "CategoriesMaster [categoryId=" + categoryId + ", categoryColor=" + categoryColor + ", categoryName="
				+ categoryName + ", createdBy=" + createdBy + ", createdDateTime=" + createdDateTime + ", isPublic="
				+ isPublic + ", updatedBy=" + updatedBy + ", updatedDateTime=" + updatedDateTime + "]";
	}
	
	
	

}