package org.pre.domain.member.admin;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.pre.domain.member.Member;

import lombok.Data;

@Entity
@DiscriminatorValue("admin")
@Data
@PrimaryKeyJoinColumn(name="admin_id")
public class Administrator extends Member{

	@OneToOne
	@JoinColumn(name="emp_id")
	private EmployeeInfo empInfo;
	
	
	private String test;
	
	
	
	
	
	
	
	

}
