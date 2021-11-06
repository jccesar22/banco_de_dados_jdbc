package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartamentDao {

	void insert(Department obj);
	void update(Department obj);
	void deletebyId(Integer id);
	Department FinfById(Integer id);
	List<Department> findAll();
}
