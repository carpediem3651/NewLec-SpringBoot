package kr.co.rland.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.boot.entity.Menu;
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
	public List<Menu> getListByCategoryId(long category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> getListByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu getById(long id) {
		Menu menu = repository.findById(id);
		return menu;
	}

	@Override
	public List<Menu> getRecommendListById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void like(long id, Long memberId, boolean on) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCart(long id, Long memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCart(long id, Long memberId, boolean small, boolean hot, int amount) {
		// TODO Auto-generated method stub
		
	}
	
}
