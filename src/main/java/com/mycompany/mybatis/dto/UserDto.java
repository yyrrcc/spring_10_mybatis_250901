package com.mycompany.mybatis.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private String userid; // 기본키
	private String username;
	
	private UserInfoDto userInfo; // 유저의 세부 정보를 멤버로 저장 (1:1 관계)
	
	private List<OrderDto> orderDtos; // 유저가 주문한 주문 리스트 (1:n 관계)

}
