package kr.co.rland.boot.service;

import java.util.List;

import kr.co.rland.boot.entity.Menu;

public interface MenuService {
	public List<Menu> getList();
	List<Menu> getListByCategoryId(long category);
	List<Menu> getListByName(String name);
	Menu getById(long id);
	List<Menu> getRecommendListById(long id);
	
	void like(long id, Long memberId, boolean on);
	void addToCart(long id, Long memberId);
	void addToCart(long id, Long memberId, boolean small, boolean hot, int amount);
}
