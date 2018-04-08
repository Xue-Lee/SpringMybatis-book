package com.icss.Dao;

import java.util.List;

import com.icss.entity.Cart;

public interface CartDao {
	public List<Cart> findCartByClient(Integer clientId);
	public List<Cart> findCartBookByClient(Integer clientId);
}
