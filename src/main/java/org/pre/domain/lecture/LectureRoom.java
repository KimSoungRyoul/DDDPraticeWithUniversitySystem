package org.pre.domain.lecture;

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
public class LectureRoom {
	
	@Id
	@GeneratedValue
	private Long lectureRoomId;
	
	@Enumerated(EnumType.STRING)
	private BuildingType building;
	
	
	private int clazzNum;

	private LectureRoom(LectureRoomBuilder builder) {
		this.building=builder.building;
		this.clazzNum=builder.clazzNum;
		
	}
	
	
	public static class LectureRoomBuilder {
		
		private BuildingType building;
		
		private int clazzNum;
		
		
		
		
		private  LectureRoomBuilder() {
			// TODO Auto-generated constructor stub
		}
		
		public LectureRoomBuilder buildingType(BuildingType type) {
			this.building=type;
			return this;
		}
		public LectureRoomBuilder clazzNum(int clazz) {
			this.clazzNum=clazz;
			return this;
			
		}
		
		public LectureRoom build() {
			return new LectureRoom(this);
		}
	}
	
}
