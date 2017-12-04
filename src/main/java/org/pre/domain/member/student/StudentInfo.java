package org.pre.domain.member.student;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.pre.domain.member.professor.Professor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*@Entity
*/
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo {

	/*@Id
	@GeneratedValue
	@Column(name="student_info_id")
	private Long studentInfoId;*/
	
	
	@Enumerated(EnumType.STRING)
	private UniversityGrade grade;
	
	
	@Enumerated(EnumType.STRING)
	private DegreeState dState;
	
		
	@OneToOne
	@JoinColumn(name="major_id")
	private UniverseDepartment uDepartmentMajor;
	
	@OneToOne
	@JoinColumn(name="minor_id")
	private UniverseDepartment uDepartmentMinor;
	
	
	@ManyToOne
	@JoinColumn(name="professor_id")
	private Professor advisorProfessor;
}
