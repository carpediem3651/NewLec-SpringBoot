package kr.co.rland.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.boot.entity.Menu;
import kr.co.rland.boot.entity.MenuView;
import kr.co.rland.boot.repository.MenuRepository;

@Service
public class MenuServiceImp implements MenuService {
	
	@Autowired
	private MenuRepository repository; 
	
	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Menu getById(long id) {
		Menu menu = repository.findById(id);
		return menu;
	}

	@Override
	public List<MenuView> getViewList() {
		List<MenuView> list = repository.findViewAll();
		return list;
	}

	@Override
	public Menu add(Menu menu) {
		// TODO Auto-generated method stub
		repository.save(menu);
		Menu newOne = repository.last();
		return newOne;
	}

	@Override
	public Menu modify(Menu menu) {
		// TODO Auto-generated method stub
		repository.update(menu);
		Menu mOne = repository.findById(menu.getId());
		return mOne;
	}
	
}
