package org.pre.domain.member.admin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class EmployeeInfo {
	
	@Id
	@GeneratedValue
	private Long empId;

	@Temporal(TemporalType.DATE)
	private Date contractedPeriod;
	
	private String bankAccount;
	
	
}
