package org.pre.domain.course;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	
	@Id
	@GeneratedValue
	private Long courseId;
	
	
	@Enumerated(EnumType.STRING)
	private CompletionType completionType;
	
	
	
	private String subjectTitle;
	
	@Embedded
	private CreditPointStructere creditPoints;
	
	
	private Boolean isRequriedForDoubleMajor;
	
	
	private Boolean isRequriedForMinor;
	
	
}
