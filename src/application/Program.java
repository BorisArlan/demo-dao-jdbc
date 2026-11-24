package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Department obj = new Department(1,"Books");
		Seller seller  = new Seller(22,"Pedro","pedro@gmail.com",new Date(),5000.0,obj); 
		System.out.println(seller);
	}

}
