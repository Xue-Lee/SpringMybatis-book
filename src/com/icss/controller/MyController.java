package com.icss.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.Dao.CartDao;
import com.icss.entity.Cart;
import com.icss.entity.Client;

@Controller
public class MyController {

	@RequestMapping("showCart")
	public String fun1(HttpServletRequest request) throws IOException{
		System.out.println("show cart--------------------");
		Client client=(Client) request.getSession().getAttribute("client");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		CartDao dao = sqlSession.getMapper(CartDao.class);
		List<Cart> clist=dao.findCartBookByClient(client.getClientId());
		request.setAttribute("cartList", clist);
		return "cartShow";
	}

	
}
