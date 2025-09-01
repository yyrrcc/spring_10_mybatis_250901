package com.mycompany.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
	
	private int orderid; // 기본키
	private String ordername;
	private String userid;
}
