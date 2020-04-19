package com.sdev.springdata.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name = "CAR_MODELS")
@EntityListeners(AuditingEntityListener.class)
public class CarModelEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MODEL_ID")
	private Long id;
	
	@Column(name = "MODEL_NAME")
	private String modelName;

	@Column(name = "DETAILS")
	private String details;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MANUFACTURER", nullable = false)
    private CarManufacturerEntity manufacturer;
	
    @JoinColumn(name = "BODY_TYPE", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private CarBodyTypeEntity bodyType;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;

	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;
}
