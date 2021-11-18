package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		System.out.println("=== teste 1: Seller FindbyId");
		Seller seller = sellerDao.FinfById(3);
		System.out.println(seller);
		
		
		System.out.println("\n=== teste 2: Seller FindbyDepartment");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.FindByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== teste 3: Seller FindbyAll");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
	}

}
