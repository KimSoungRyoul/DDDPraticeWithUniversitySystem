package org.pre.domain.member.student;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import org.pre.domain.course_registration.CourseRegistration;
import org.pre.domain.course_registration.RealCourseRegistration;
import org.pre.domain.member.Member;
import org.pre.domain.member.professor.Professor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@DiscriminatorValue("student")
@PrimaryKeyJoinColumn(name="student_id")
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class Student extends Member{

	@Lob
	private byte[] profilePhotoFile;
	
	@ManyToOne
	@JoinColumn(name="major_department")
	private UniverseDepartment uDepartment;
	
	/*@OneToOne
	@JoinColumn(name="student_info_id")*/
	@Embedded
	private StudentInfo studentInfo;
	
	@OneToMany
	@JoinColumn(name="ac_performance_id2",nullable=true)
	private List<AcademicPerformance> academicPerformanceList=new LinkedList<>();
	
	
	@OneToMany
	@JoinColumn(name="course_reg_id2",nullable=true)
	private List<RealCourseRegistration> courseRegistrationList=new LinkedList<>();
	
	
}
