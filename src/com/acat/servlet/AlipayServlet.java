package com.acat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acat.util.AlipayUtil;

public class AlipayServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--------------");
		//商户订单号，商户网站订单系统中唯一订单号，必填
		String orderId = request.getParameter("WIDout_trade_no");
		
		System.out.println(orderId);
		//付款金额，必填
		String money = request.getParameter("WIDtotal_amount");
		
		System.out.println(money);
		//订单名称，必填
		String name = request.getParameter("WIDsubject");
		System.out.println(name);
		
		//商品描述，可空
		String info = request.getParameter("WIDbody");
		System.out.println(info);
		try {
			String result = AlipayUtil.pay(response, money, info, name, orderId);
			request.setAttribute("result", result);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/hello.jsp").forward(request,response);
	}
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
 
} 