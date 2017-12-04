package org.pre.domain.course_registration;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.pre.domain.lecture.Lecture;
import org.pre.domain.member.Member;
import org.pre.domain.member.student.Student;

import lombok.Data;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "registration_type")
@Data
public abstract class CourseRegistration {
	
	@Id
	@GeneratedValue
	private Long courseRegId;
	
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student registrationOwner;
	
	
	
	private int maxCreditPoints;
	
	
	@OneToMany
	@JoinColumn(name="contained_lecture_id")
	private Set<Lecture> registeredLecture=new HashSet<>();

	
	private int courseCnt;

	
	private int creditCnt;

	
	public void registerCourse() {

		checkRegisterRequest();
	}

	
	private void checkRegisterRequest() {

	}
	
	
}
