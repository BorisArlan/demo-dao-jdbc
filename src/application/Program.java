package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		System.out.println("\n=== Teste 1 : Seller fyndById ===");
		Seller seller = sellerDao.findById(5);
		System.out.println(seller);
		
		System.out.println("\n=== Teste 2 : Seller fyndByDepartment ===");
		Department dep = new Department(1, null);
		List<Seller> sellerDep = sellerDao.findByDepartment(dep);
		
		for(Seller obj : sellerDep) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 2 : Seller fyndByDepartment ===");
		sellerDep = sellerDao.findAll();
		
		for(Seller obj : sellerDep) {
			System.out.println(obj);
		}
		
	}

}
