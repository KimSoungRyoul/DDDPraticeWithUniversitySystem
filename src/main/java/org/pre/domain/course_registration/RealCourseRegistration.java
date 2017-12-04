package org.pre.domain.course_registration;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("real_registration")
@PrimaryKeyJoinColumn(name="real_course_reg_id")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealCourseRegistration extends CourseRegistration{

	
	private int AttendanceScore;
	
	private int MidtermScore;
	
	private int FinalTermScore;
	
	private int etcScore;
	
	private int TotalScore;
	
	private String scoreDescription;
	
	
	
}
