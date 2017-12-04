package org.pre.domain.member.authorication;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.pre.domain.member.Member;
import org.pre.domain.member.RoleType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrantedAuthority {

	/**
	 * 
	 */
	
	@Id
	@GeneratedValue
	private Long grantedAuthorityId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date grantedDate;

	@Enumerated(EnumType.STRING)
	private RoleType authority;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="authority_owner")
	private Member authorityOwner;
	
	
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority.toString();
		
	}

}