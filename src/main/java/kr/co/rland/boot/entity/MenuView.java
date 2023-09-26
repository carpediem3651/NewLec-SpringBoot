package kr.co.rland.boot.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
public class MenuView {
	private long id;
	private String korName;
	private String engName;
	private int price;
	private String img;
	private Date regDate;
	private int hit;
	private long memberId;
	
	private int likeCount;
}
