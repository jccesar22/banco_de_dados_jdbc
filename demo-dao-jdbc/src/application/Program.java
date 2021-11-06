package application;

import java.util.Date;

import model.entities.Departmente;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departmente obj = new Departmente(1, "Books");
		
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);
	}

}
