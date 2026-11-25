package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		System.out.println("=== Teste 1 : Seller fyndById ===");
		Seller seller = sellerDao.findById(5);
		
		System.out.println(seller);
	}

}
