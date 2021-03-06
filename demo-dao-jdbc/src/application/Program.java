package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		System.out.println("\n=== teste 4: Seller insert");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		
		
		System.out.println("\n=== teste : Seller update");
		seller = sellerDao.FinfById(1);
		seller.setName("Martha waine");
		sellerDao.update(seller);
		System.out.println("update complete");
		
		
		System.out.println("\n=== teste 6: Seller delete");
		System.out.println("Enter Id form delete test");
		int id = sc.nextInt();
		sellerDao.deletebyId(id);
		System.out.println("delete completd ");
	}

}
