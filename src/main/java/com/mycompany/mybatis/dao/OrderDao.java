package com.mycompany.mybatis.dao;

import java.util.List;

import com.mycompany.mybatis.dto.OrderDto;
import com.mycompany.mybatis.dto.UserDto;
import com.mycompany.mybatis.dto.UserIdInfoDto;
import com.mycompany.mybatis.dto.UserInfoDto;

public interface OrderDao {

	public List<OrderDto> orderListDao(); // 모든 주문 리스트 가져오기
	public List<UserDto> userListDao(); // 모든 회원 리스트 가져오기
	public UserDto UserSearchDao(String userid); // 특정 유저 아이디 회원 가져오기
	
	public UserIdInfoDto userInfoDao(String userid); // 특정 유저의 세부정보 가져오기 (새롭게 dto 만듬) -> 비효율적 비추
	public UserDto UserInfoMapDao(String userid); // userInfoDao를 스프링 프레임워크 형식으로! -> 추천
}
