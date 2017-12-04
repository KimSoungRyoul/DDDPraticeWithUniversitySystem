package org.pre.repository;

import org.pre.domain.member.professor.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

	public Professor findByName(String name);
	
}
