package edu.examples.java_classes.logic;

import java.util.List;

import edu.examples.java_classes.entity.Medicine;

public interface MedicinesLogic {

	public void add(Medicine medicines) throws LogicException;

	public void clear() throws LogicException;

	public void update(Medicine medicines) throws LogicException;

	public void delete(String id) throws LogicException;
	
	public List<Medicine> find(String text) throws LogicException;

	public List<Medicine> getAll() throws LogicException;
}
