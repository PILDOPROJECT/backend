package com.philDo.stuget.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*정산 테이블*/
/*
CREATE TABLE `ADJ_TB` (
	`ADJ_ID`		INT		    	NOT NULL,     
	`CREW_ID`		INT		    	NOT NULL,     
	`ADJ_DATE`		DATETIME    	NULL,         
	`ADJ_TOTALMON`	DECIMAL(10,2)	NULL,         
	`ADJ_MON`		DECIMAL(10,2)	NULL,         
	`ADJ_SUC`		CHAR(2)			NULL,         
	`ADJ_SUCDATE`	DATETIME		NULL          
);
*/

/*정산 테이블 PK 설정*/
/*
ALTER TABLE `ADJ_TB` ADD CONSTRAINT `PK_ADJ_TB` PRIMARY KEY (
	`ADJ_ID`,
	`CREW_ID`
);
);*/

@Getter
@Setter
@ToString
public class AdjustmentVO {
	private int		adjId;			/*정산아이디*/ 
	private int 	crewId;			/*모임번호*/  
	private String  adjDate;		/*정산일*/   
	private String  adjTotalmon;	/*총정산금액*/ 
	private String  adjMon;			/*정산금액*/  
	private String  adjSuc;			/*정산완료여부*/
	private String  adjSucdate;		/*정산완료일*/ 
}
