package board.vo;

import java.util.Date;

import lombok.Data;

//VO(Value Object)

@Data
public class BoardVO {

	private int 	seq;
	private String 	title;
	private String 	writer;
	private String 	content;
	private Date 	regDate;
	private int 	cnt;

}