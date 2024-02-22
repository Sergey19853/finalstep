package edu.examples.java_classes.logic.impl;

import java.util.List;

import edu.examples.java_classes.dao.DaoException;
import edu.examples.java_classes.dao.DaoProvider;
import edu.examples.java_classes.dao.MedicinesDao;
import edu.examples.java_classes.entity.Medicine;
import edu.examples.java_classes.logic.LogicException;
import edu.examples.java_classes.logic.MedicinesLogic;

public class MedicinesLogicImpl implements MedicinesLogic {
	
	private final DaoProvider provider = DaoProvider.getInstance();
	private final MedicinesDao dao = provider.getMedicinesDao();
	
	@Override
	public void add(Medicine medicines) throws LogicException{
		try {
			dao.save(medicines);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}
	
	@Override
	public void clear() throws LogicException {
		try {
			dao.clear();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void update(Medicine medicines) throws LogicException {
		try {
			dao.update(medicines);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void delete(String id) throws LogicException{
		try {
			dao.delete(id);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}
	
	@Override
	public List<Medicine> find(String text) throws LogicException{
		 try {
			  return dao.getAll()
			    .stream()
			    .filter(
			      m -> m.getNameMedicine().contains(text) || m.getPharmacy().contains(text) || m.getCity().contains(text) || m.getInstructions().contains(text)
			    )
			    .toList();
			 } catch (DaoException e) {
			  throw new LogicException(e);
			 }
	}
	
	@Override
	public List<Medicine> getAll() throws LogicException{
		try {
			return dao.getAll();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}	
	
}
