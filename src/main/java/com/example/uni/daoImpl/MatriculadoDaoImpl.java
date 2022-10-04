package com.example.uni.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.uni.entity.Matriculado;
import com.example.uni.dao.Operaciones;

@Component
public class MatriculadoDaoImpl implements Operaciones<Matriculado>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Matriculado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Matriculado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Matriculado read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select * from persona\r\n"
				+ "WHERE telefono is NOT NULL\r\n"
				+ "order by 1;";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select p.nombre, p.sexo, a.nombre as \"curso\" ,g.nombre as \"grado\" from alumno_se_matricula_asignatura asma \r\n"
				+ "inner join persona p\r\n"
				+ "on asma.id_alumno=  p.id\r\n"
				+ "inner join asignatura a\r\n"
				+ "on  asma.id_asignatura= a.id\r\n"
				+ "inner join grado g\r\n"
				+ "on  a.id_grado  = g.id";
		return jdbcTemplate.queryForList(SQL);
		
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		String SQL = "select p.nombre, ce.anyo_inicio from alumno_se_matricula_asignatura asma \r\n"
				+ "inner join curso_escolar ce \r\n"
				+ "on ce.id = asma.id_curso_escolar\r\n"
				+ "inner join persona p \r\n"
				+ "on asma.id_alumno=  p.id;";
		return jdbcTemplate.queryForList(SQL);
	}
	
	

	
	

}
