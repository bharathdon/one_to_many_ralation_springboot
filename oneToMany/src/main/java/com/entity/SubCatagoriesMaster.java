package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * The persistent class for the sub_catagories_master database table.
 * 
 */

@Entity
@Table(name="sub_catagories_master")
@NamedQuery(name="SubCatagoriesMaster.findAll", query="SELECT s FROM SubCatagoriesMaster s")
public class SubCatagoriesMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sub_category_id")
	private int subCategoryId;

	@Column(name="category_id")
	private int categoryId;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date_time")
	private Date createdDateTime;

	@Column(name="is_public")
	private byte isPublic;

	@Column(name="sub_category_color")
	private String subCategoryColor;

	@Column(name="sub_category_name")
	private String subCategoryName;

	@Column(name="updated_by")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date_time")
	private Date updatedDateTime;

	//bi-directional many-to-one association to UserIncomeTrack
	@ManyToOne(optional = false )
	@JoinColumn(name="sub_category_id",insertable = false,updatable = false)
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
//	@NotFound(action = NotFoundAction.IGNORE)

	private UserIncomeTrack userIncomeTrack;

	public SubCatagoriesMaster() {
	}

	public int getSubCategoryId() {
		return this.subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

	public String getSubCategoryColor() {
		return this.subCategoryColor;
	}

	public void setSubCategoryColor(String subCategoryColor) {
		this.subCategoryColor = subCategoryColor;
	}

	public String getSubCategoryName() {
		return this.subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
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

	public SubCatagoriesMaster(int subCategoryId, int categoryId, String createdBy, Date createdDateTime, byte isPublic,
			String subCategoryColor, String subCategoryName, String updatedBy, Date updatedDateTime) {
		super();
		this.subCategoryId = subCategoryId;
		this.categoryId = categoryId;
		this.createdBy = createdBy;
		this.createdDateTime = createdDateTime;
		this.isPublic = isPublic;
		this.subCategoryColor = subCategoryColor;
		this.subCategoryName = subCategoryName;
		this.updatedBy = updatedBy;
		this.updatedDateTime = updatedDateTime;
//		this.userIncomeTrack = userIncomeTrack;
	}

	@Override
	public String toString() {
		return "SubCatagoriesMaster [subCategoryId=" + subCategoryId + ", categoryId=" + categoryId + ", createdBy="
				+ createdBy + ", createdDateTime=" + createdDateTime + ", isPublic=" + isPublic + ", subCategoryColor="
				+ subCategoryColor + ", subCategoryName=" + subCategoryName + ", updatedBy=" + updatedBy
				+ ", updatedDateTime=" + updatedDateTime + "]";
	}
	
	

}