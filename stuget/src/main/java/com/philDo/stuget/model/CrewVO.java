package com.philDo.stuget.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*모임 테이블*/
/*
CREATE TABLE `CREW_TB` (
	`CREW_SQ`			INT				NOT NULL AUTO_INCREMENT PRIMARY KEY,
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
	`CREW_SQ`,
	`USER_SQ`
);
);*/

@Getter
@Setter
@ToString
public class CrewVO {
	private int		crewSq;            /*모임 번호*/                                                                                                                        
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
	
//	join을 위한 user_tb 컬럼
	private String  userId;          /*회원아이디*/                  
	private String  userName;        /*회원이름*/                   
	private String  userEmail;       /*이메일*/                    
	private String  userLoc;         /*기본주소*/                   
	private String  userLocdt;       /*상세주소*/                   
	private String  userCellphone;   /*전화번호*/                   
	private String  userGender;      /*성별*/                     
	private String  userBirth;       /*생년월일YYYYMMDD*/           
	private String  userType;        /*구분 admin=0, user=1*/     
	private String  userAccNum;      /*계좌번호*/                   
	private String  userACCname;     /*계좌은행*/                   
	private String  userCrewyn;      /*모임가입여부 미가입=0, 가입=1*/     
	private String  userDatetime;    /*가입일자ㅣ*/                  
	private String  userSco;         /*회원 평점*/                  
	private String  userReprot;      /*신고여부 신고x=0, 신고ㅇ=1*/

}
