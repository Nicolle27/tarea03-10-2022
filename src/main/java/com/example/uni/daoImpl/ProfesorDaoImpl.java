package com.example.uni.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.uni.dao.Operaciones;
import com.example.uni.entity.Profesor;

@Component
public class ProfesorDaoImpl implements Operaciones<Profesor>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Profesor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL="select p2.nombre,d.nombre as \"departamento\",id_departamento from profesor p \r\n"
				+ "                inner join  persona p2 \r\n"
				+ "                on p.id_profesor = p2.id \r\n"
				+ "                inner join  departamento d \r\n"
				+ "                on p.id_departamento  = d.id;";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
