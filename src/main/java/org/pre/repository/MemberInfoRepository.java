package org.pre.repository;

import org.pre.domain.member.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberInfoRepository extends JpaRepository<MemberInfo, Long>{

	public MemberInfo findByNameWithKorean(String name); 
	
}
