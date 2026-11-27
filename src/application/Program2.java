package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n=== Teste 1 : Department INSERT ===");
		
		DepartmentDao depDao = DaoFactory.creatDepartment();
		Department department = new Department(null,"TI");
		depDao.insert(department);
		System.out.println("Isert Complete! Id created --> "+department.getId());
		
		System.out.println("\n=== Teste 2 : Department UPDATE ===");
		Department dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== Teste 3 : Department FINDBYD ===");
		dep = depDao.findById(4);
		dep.setName("Agro");
		depDao.update(dep);
		System.out.println("Insert Completed");
		
		System.out.println("\n=== Teste 3 : Department FINDALL ===");
		List<Department> depAll = depDao.findAll();
		
		for(Department dp : depAll) {
			System.out.println(dp);
			
		}
		
		System.out.println("\n=== Teste 3 : Department DELETE ===");
		System.out.println("Digite ID do item a ser deletado!");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete Completed");

		
		
		
		
	}

}
