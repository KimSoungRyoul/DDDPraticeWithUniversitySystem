package org.pre.repository;

import org.pre.domain.lecture.LectureRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRoomRepository extends JpaRepository<LectureRoom, Long>{

	public LectureRoom findByClazzNum(int num);
	
}
