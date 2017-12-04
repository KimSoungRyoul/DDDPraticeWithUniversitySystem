package org.pre.repository;

import org.pre.domain.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{

	public Course findBySubjectTitle(String title);
	
}
