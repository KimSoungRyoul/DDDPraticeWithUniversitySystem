package org.pre.repository;

import java.util.Set;

import org.pre.domain.member.RoleType;
import org.pre.domain.member.authorication.GrantedAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<GrantedAuthority, Long>{

	public GrantedAuthority findByAuthorityOwnerMemberEmail(String email);
	
	public Set<GrantedAuthority> findByAuthority(RoleType rType);

	
	
}
