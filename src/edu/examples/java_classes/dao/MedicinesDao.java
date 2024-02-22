package edu.examples.java_classes.dao;

import java.util.List;
import edu.examples.java_classes.entity.Medicine;

public interface MedicinesDao {
	void save(Medicine n) throws DaoException;

	void update(Medicine n) throws DaoException;

	List<Medicine> getAll() throws DaoException;

	void clear() throws DaoException;

	void delete(String id) throws DaoException;
}
