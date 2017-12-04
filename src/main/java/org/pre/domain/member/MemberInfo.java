package org.pre.domain.member;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfo {
	
	
	@Id
	@GeneratedValue
	@Column(name="member_info_id")
	private Long memberInfoId;
	
	private String nameWithKorean;
	
	private String nameWithEnglish;
	
	private String socialNumber;
	
	private Date birthDate;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Enumerated(EnumType.STRING)
	private Nationality nationality;
	
	private String phoneNum;
	
	private String homeNum;
	
	private String webMail;

}
