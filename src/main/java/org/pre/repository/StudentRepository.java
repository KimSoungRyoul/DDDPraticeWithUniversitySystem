package org.pre.repository;

import org.pre.domain.member.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

	public Student findByUDepartmentUDepartmentName(String name);
	
}
