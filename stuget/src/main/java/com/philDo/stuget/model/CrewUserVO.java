package com.philDo.stuget.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*모임 회원 테이블*/
/*
CREATE TABLE `CREW_USER_TB` (
	`CREW_SQ`		INT			NOT NULL,	
	`USER_SQ`		INT			NOT NULL,	
	`USER_NAME`		VARCHAR(10)	NULL,		
	`JOIN_DATE`		DATETIME	NULL,		
	`CREW_ADJTYPE`	CHAR(2)		NULL		
);   
);
*/

/*모임 회원 PK 설정*/
/*
ALTER TABLE `CREW_USER_TB` ADD CONSTRAINT `PK_CREW_USER_TB` PRIMARY KEY (
	`CREW_ID`,
	`USER_SQ`
);
);*/

@Getter
@Setter
@ToString
public class CrewUserVO {
	private int		crewSq;         /*모임 번호*/                       
	private int 	userSq;         /*회원 번호*/                 
	private String  userName;       /*회원 이름*/                              
	private String  joindate;       /*모임 참여일*/               
	private String  crewAdjtype;	/*정산완료여부 정산미완료=0, 정산완료=1*/      
}
