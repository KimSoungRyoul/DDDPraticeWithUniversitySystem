package org.pre.domain.course;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditPointStructere {
	// �⺻ ����
	private int basicCredits;
	//���� ����
	private int architectCredits;
	//�ǽ� ����
	private int trainingCredits;
	
	


	//���־��̴� ���� ����1
	public static CreditPointStructere generate3_3_0() {
		
		return new CreditPointStructere(3,3,0);
	}
	
	
	//���־��̴� ��������2
public static CreditPointStructere generate3_2_1() {
		
		return new CreditPointStructere(3,3,0);
	}
	
}
