package org.pre.domain.course_registration;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("pre_registration")
@PrimaryKeyJoinColumn(name="pre_course_reg_id")
@Data
@EqualsAndHashCode(callSuper=false)
public class PreCourseRegisteration extends CourseRegistration {

	@Temporal(TemporalType.TIMESTAMP)
	private Date addDate;
	
}
