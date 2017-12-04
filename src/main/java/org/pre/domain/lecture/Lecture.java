package org.pre.domain.lecture;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.pre.domain.course.Course;
import org.pre.domain.member.professor.Professor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lecture {

	@Id
	@GeneratedValue
	@Column(name="lecture_id")
	private Long lectureId;

	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="charged_professor_id",insertable=true,updatable=true)
	private Professor professorInCharge;

	@ManyToOne
	@JoinColumn(name="charged_course_id",insertable=true,updatable=false)
	private Course course;

	
	private String timeAndDate;
	

	
	@ManyToOne
	@JoinColumn(name="lecture_room_id2",insertable=false,updatable=false)
	private LectureRoom lectureRoom;
	
	
	private String lectureDescription;

	
	
	
	
	
}
