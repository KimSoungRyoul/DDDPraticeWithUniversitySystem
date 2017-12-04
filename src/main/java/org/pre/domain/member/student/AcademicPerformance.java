package org.pre.domain.member.student;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.pre.domain.course.Course;
import org.pre.domain.course_registration.CourseRegistration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcademicPerformance {

	@Id
	@GeneratedValue
	private Long acPerformanceId;
	
	private int yearOfAcquisition;
	
	private int semester;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	
	
	
	
	
	@Enumerated(EnumType.STRING)
	private AquiredGrade aquiredGrade;
	
	private boolean baWarning;
	
}
