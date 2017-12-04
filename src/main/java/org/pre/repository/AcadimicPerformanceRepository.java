package org.pre.repository;

import org.pre.domain.member.student.AcademicPerformance;
import org.pre.domain.member.student.AquiredGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcadimicPerformanceRepository extends JpaRepository<AcademicPerformance, Long>{
	public AcademicPerformance findByAquiredGrade(AquiredGrade grade);
}
