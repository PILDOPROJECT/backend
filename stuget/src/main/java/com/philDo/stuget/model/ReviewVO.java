package com.philDo.stuget.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*후기 테이블*/
/*
CREATE TABLE `REVIEW_TB` (
	`REV_ID`		INT				NOT null AUTO_INCREMENT PRIMARY KEY,	
	`CREW_SQ`		INT				NOT NULL,	
	`REV_TITLE`		VARCHAR(100)	NULL,		
	`REV_DETAIL`	VARCHAR(100)	NULL,       
	`REV_SCO`		CHAR(2)			NULL,		
	`REV_TYPE`		CHAR(2)			NULL,       
	`REV_FILEURL`	VARCHAR(1000)	NULL,		
	`USER_SQ`		INT				NOT NULL    
);   
);
*/

/*후기 테이블 PK 설정*/
/*
ALTER TABLE `REVIEW_TB` ADD CONSTRAINT `PK_REVIEW_TB` PRIMARY KEY (
	`REV_ID`
);
);*/

@Getter
@Setter
@ToString
public class ReviewVO {
	private int		revId;          /*후기번호*/   
	private int 	crewSq;         /*모임번호*/  
	private String  revTitle;       /*후기제목*/          
	private String  revDetail;      /*후기 내용*/  
	private String  revSco;         /*후기 평점*/  
	private String  revType;		/*후기 구분*/  
	private String  revFileurl;		/*S3파일URL*/
	private int  	userSq;			/*회원번호*/   
}
