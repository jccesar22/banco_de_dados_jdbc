package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public interface DaoFactory {
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
