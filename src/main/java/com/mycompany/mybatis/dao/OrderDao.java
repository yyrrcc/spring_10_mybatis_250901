package com.mycompany.mybatis.dao;

import java.util.List;

import com.mycompany.mybatis.dto.OrderDto;
import com.mycompany.mybatis.dto.UserDto;

public interface OrderDao {

	public List<OrderDto> orderListDao(); // 모든 주문 리스트 가져오기
	public List<UserDto> userListDao(); // 모든 회원 리스트 가져오기
	public UserDto UserSearchDao(String userid); // 특정 유저 아이디 회원 가져오기
}
