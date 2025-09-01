package com.mycompany.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.mybatis.dao.OrderDao;

@Controller
public class JoinController {
	
	@Autowired
	// <beans:bean name="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean"> 연동을 위해
	private SqlSession sqlSession;
	
	@RequestMapping (value = "/userlist")
	public String userlist(HttpServletRequest request, Model model) {
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("userList", orderDao.userListDao());
		return "userlist";
	}
	
	@RequestMapping (value = "/orderlist")
	public String orderlist(HttpServletRequest request, Model model) {
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("orderList", orderDao.orderListDao());
		return "orderlist";
	}
	
	@RequestMapping (value = "/usersearch")
	public String usersearch(HttpServletRequest request, Model model) {
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("user", orderDao.UserSearchDao("kim"));
		return "usersearch";
	}
	
	@RequestMapping (value = "/userinfo")
	public String userinfo(HttpServletRequest request, Model model) {
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("userinfo", orderDao.userInfoDao("kim"));
		return "userinfo";
	}
	
	@RequestMapping (value = "/userinfo2")
	public String userinfo2(HttpServletRequest request, Model model) {
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("userDto", orderDao.UserInfoMapDao("kim"));
		return "userinfo2";
	}
	
	@RequestMapping (value = "/userorder")
	public String userorder(HttpServletRequest request, Model model) {
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("userOrder", orderDao.userOrderListDao("lee"));
		return "userorder";
	}
	
	@RequestMapping (value = "/alluserorder")
	public String alluserorder(HttpServletRequest request, Model model) {
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("allUserOrders", orderDao.allUserOrderListDao());
		return "alluserorder";
	}
}
