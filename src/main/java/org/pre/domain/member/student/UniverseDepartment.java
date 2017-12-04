package org.pre.domain.member.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//이거 엔티티로 수정   ,,, 학과
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniverseDepartment {

	@Id
	@GeneratedValue
	private Long uDepartmentId;
	 
	
	private String uDepartmentName;
	
	private String uDepartmentTelNum;
	
}
