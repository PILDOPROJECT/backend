package com.philDo.stuget.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*회원 테이블*/
/*
CREATE TABLE `USER_TB` (
	`USER_SQ`			INT				NOT NULL,
	`USER_ID`			VARCHAR(20)		NOT NULL,
	`USER_PW`			VARCHAR(60)		NULL,	
	`USER_NAME`			VARCHAR(10)		NULL,	
	`USER_EMAIL`		VARCHAR(50)		NULL,	
	`USER_LOC`			VARCHAR(50)		NULL,	
	`USER_LOCDT`		VARCHAR(100)	NULL,	
	`USER_CELLPHONE`	VARCHAR(20)		NULL,	
	`USER_GENDER`		VARCHAR(20)		NULL,	
	`USER_BIRTH`		VARCHAR(10)		NULL,	
	`USER_TYPE`			CHAR(2)			NULL,	
	`USER_ACCNUM`		VARCHAR(20)		NULL,	
	`USER_ACCNAME`		VARCHAR(10)		NULL,	
	`USER_CREWYN`		CHAR(2)			NULL,	
	`USER_DATETIME`		DATETIME		NULL,	
	`USER_SCO`			CHAR(2)			NULL,	
	`USER_REPORT`		CHAR(2)			null	
);
*/

/*회원 테이블 PK 설정*/
/*
ALTER TABLE `USER_TB` ADD CONSTRAINT `PK_USER_TB` PRIMARY KEY (
	`USER_SQ`
);*/

@Getter
@Setter
@ToString
public class UserVO {
	private int		userSq;          /*회원 번호*/                  
	private String  userId;          /*회원아이디*/                  
	private String  userPw;          /*비밀번호*/	               
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
