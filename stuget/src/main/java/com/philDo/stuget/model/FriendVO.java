package com.philDo.stuget.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*친구 테이블*/
/*
CREATE TABLE `FRIEND_TB` (
	`FRI_SQ`	INT			NOT NULL,	
	`USER_SQ`	INT			NOT NULL,   
	`FRI_ID`	VARCHAR(20)	NOT NULL,   
	`FRI_DATE`	DATETIME	NULL        
);

*/

/*친구 테이블 PK 설정*/
/*
ALTER TABLE `FRIEND_TB` ADD CONSTRAINT `PK_FRIEND_TB` PRIMARY KEY (
	`FRI_SQ`,
	`USER_SQ`
);
);*/

@Getter
@Setter
@ToString
public class FriendVO {
	private int		friSq;      /*친구 번호*/        
	private int 	userSq;     /*회원 번호*/       
	private String  friId;      /*친구 아이디*/                 
	private String  friDate;	/*친구신청날짜*/    
}
