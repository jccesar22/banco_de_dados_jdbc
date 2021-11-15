package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		Seller seller = sellerDao.FinfById(3);
		
		System.out.println(seller);
	}

}
