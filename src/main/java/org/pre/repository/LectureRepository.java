package org.pre.repository;

import java.util.Set;

import org.pre.domain.lecture.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LectureRepository extends JpaRepository<Lecture, Long>{

	
	
}
