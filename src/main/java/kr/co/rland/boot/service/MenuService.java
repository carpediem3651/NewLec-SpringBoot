package kr.co.rland.boot.service;

import java.util.List;

import kr.co.rland.boot.entity.Menu;
import kr.co.rland.boot.entity.MenuView;

public interface MenuService {
	List<Menu> getList();
	Menu getById(long id);
	List<MenuView> getViewList();
}
