package com.philDo.stuget.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*모임 테이블*/
/*
CREATE TABLE `CREW_TB` (
	`CREW_ID`			INT				NOT NULL,
	`USER_SQ`			INT				NOT NULL, 
	`CREW_TYPE`			CHAR(2)			NOT NULL,
	`CREW_NAME`			VARCHAR(20)		NULL,     
	`CREW_LOC`			VARCHAR(10)		NULL,     
	`CREW_LOCDT`		VARCHAR(100)	NULL,     
	`CREW_MIN`			INT				NULL,      
	`CREW_MAX`			INT				NULL,      
	`CREW_ACCNUM`		VARCHAR(20)		NULL,      
	`CREW_ACCNAME`		VARCHAR(10)		NULL,      
	`CREW_CDATE`		DATETIME		NULL,      
	`CREW_STDATE`		DATETIME		NULL,      
	`CREW_FDATE`		DATETIME		NULL,      
	`CREW_DDAY`			DATETIME		NULL,      
	`CREW_ENDDATE`		DATETIME		NULL,      
	`CREW_ADJSUC`		CHAR(2)			NULL,      
	`CREW_ADJSUCDATE`	DATETIME		NULL       
);
*/

/*모임 테이블 PK 설정*/
/*
ALTER TABLE `CREW_TB` ADD CONSTRAINT `PK_CREW_TB` PRIMARY KEY (
	`CREW_ID`,
	`USER_SQ`
);
);*/

@Getter
@Setter
@ToString
public class CrewVO {
	private int		crewId;            /*모임 번호*/                                                                                                                        
	private int 	userSq;            /*회원 번호*/                                                                                                                        
	private String  crewType;          /*모임 종류 - 일반=00, 스포츠=01, 스터디=02, 독서=03, 반려동물=04, 임신/육아=05, 생활/편의=06, 고민/사연=078, 동네친구=08, 영화/드라마=09, 여행=10*/                      
	private String  crewName;          /*모임 이름*/                                                                                                                        
	private String  crewLoc;           /*모임 지역*/                                                                                                                        
	private String  crewLocdt;         /*모임 상세 지역*/                                                                                                                     
	private int  	crewMin;           /*모임 최소 인원*/                                                                                                                     
	private int  	crewMam;           /*모임 최대 인원*/                                                                                                                     
	private String  crewAccnum;        /*모임 대표 계좌*/                                                                                                                     
	private String  crewAccname;       /*모임 대표 개좌 은행*/                                                                                                                  
	private String  crewCdate;         /*모임 생성일*/                                                                                                                       
	private String  crewStdate;        /*모임 모집일*/                                                                                                                       
	private String  crewFdate;         /*모임 종료일*/                                                                                                                       
	private String  crewDdya;          /*모임일*/                                                                                                                          
	private String  crewEnddate;       /*모임 종료일*/                                                                                                                       
	private String  crewAdjsuc;        /*정산완료여부*/                                                                                                                       
	private String  crewAdjsucdate;    /*정산 완료일*/                                                                                                                       

}
