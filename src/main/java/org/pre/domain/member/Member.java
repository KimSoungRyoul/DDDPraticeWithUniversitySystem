package org.pre.domain.member;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.pre.domain.member.authorication.GrantedAuthority;
import org.pre.domain.member.authorication.MemberAuthorization;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "member_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Member implements MemberAuthorization{
	
	
	@Id
	@GeneratedValue
	@Column(name="member_id")
	private Long memberId;
	
	
	@OneToOne
	@JoinColumn(name="member_info_id")
	private MemberInfo memberInfo;

	@Column(unique=true,nullable=false)
	private String memberEmail;
	
	
	private String password;
	
	@OneToMany(mappedBy="authorityOwner",cascade=CascadeType.ALL)
	@JsonBackReference
	Set<GrantedAuthority> authorities=new HashSet<>();
	
	
	
	@Override
	public Set<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUserID() {
		// TODO Auto-generated method stub
		return memberEmail;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
