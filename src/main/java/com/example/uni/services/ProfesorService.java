package com.example.uni.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uni.dao.Operaciones;
import com.example.uni.daoImpl.ProfesorDaoImpl;
import com.example.uni.entity.Profesor;

@Service
public class ProfesorService implements Operaciones<Profesor>{
	
	@Autowired
	private ProfesorDaoImpl daoIMpl;

	@Override
	public  int create(Profesor t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
	}

	@Override
	public int update(Profesor t) {
		// TODO Auto-generated method stub
		return daoIMpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoIMpl.delete(id);
	}

	@Override
	public Profesor read(int id) {
		// TODO Auto-generated method stub
		return daoIMpl.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll3();
	}


	
}
