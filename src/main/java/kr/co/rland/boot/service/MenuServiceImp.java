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
	
}
