package org.pre.domain.member.professor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.pre.domain.member.Member;
import org.pre.domain.member.student.UniverseDepartment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("professor")
@PrimaryKeyJoinColumn(name="professor_id")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public class Professor extends Member{
	
	
	
	private String name;
	
	
	@OneToOne
	@JoinColumn(name="associated_department")
	private UniverseDepartment uDepartment;
	
	
	//세부전공
	private String detailMajor;
	
	
	private String description;

}
