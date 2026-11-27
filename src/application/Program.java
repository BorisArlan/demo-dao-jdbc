package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("\n=== Teste 3 : Seller fyndByAll ===");
		sellerDep = sellerDao.findAll();
		
		for(Seller obj : sellerDep) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 4 : Seller Insert ===");
		//Seller newSeller = new Seller(null,"joao","joao@gmail.com",new Date(),4000.0,dep);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserido "+newSeller.getId());
		System.out.println("\n=== Teste 5 : Seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Tony Garrido");
		sellerDao.update(seller);
		System.out.println("Update Completed !");
		
		System.out.println("\n=== Teste 6 : Seller Delete ===");
		System.out.println("Digite o ID a ser Deletado! ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Competed!");
		
		
		sc.close();
		
		
	}

}
