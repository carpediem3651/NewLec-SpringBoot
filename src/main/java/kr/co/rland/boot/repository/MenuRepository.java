package kr.co.rland.boot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.boot.entity.Menu;
import kr.co.rland.boot.entity.MenuView;

@Mapper
public interface MenuRepository {
	
	List<Menu> findAll();
	Menu findById(long id);
	List<MenuView> findViewAll();
	void save(Menu menu);
	Menu last();
	void update(Menu menu);
}
