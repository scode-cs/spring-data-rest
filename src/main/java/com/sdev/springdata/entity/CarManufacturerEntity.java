package com.sdev.springdata.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CAR_MANUFACTURERS")
@EntityListeners(AuditingEntityListener.class)
public class CarManufacturerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MANUFACTURER_ID")
	private Long id;

	@Column(name = "BRAND_NAME")
	private String brandName;

	@Column(name = "ABOUT")
	private String about;

	@Column(name = "ESTABLISHMENT")
	private String establishment;

	@Column(name = "HEADQUARTER")
	private String headquarter;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "manufacturer")
	private List<CarModelEntity> models;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;

	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;
}
