package kr.co.rland.boot.entity;

import java.util.Date;

import groovy.transform.ToString;
import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@lombok.ToString
public class Menu {
	private long id;
	private String korName;
	private String engName;
	private int price;
	private String img;
	private Date regDate;
	private int hit;
	private long memberId;
}
