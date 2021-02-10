package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao();

		System.out.println(" ==== Test 1: seller FindById ======");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		System.out.println(" ==== Test 2: seller FindByDepartment ======");
		System.out.println(seller);
		Department department = new Department(4, null);
		List<Seller> list = sellerdao.findByDepartment(department);

		for (Seller obj : list) {

			System.out.println(obj);
		}

		System.out.println(" ==== Test 3: seller FindByAll ======");
		System.out.println(seller);
		list = sellerdao.findAll();
		for (Seller obj : list) {

			System.out.println(obj);

		}

		System.out.println(" ==== Test 5: seller Insert ======");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerdao.insert(newSeller);

		System.out.println("Inserted! New Id = " + newSeller.getId());
		
		
		System.out.println(" ==== Test 5: seller Update ======");
		seller = sellerdao.findById(1);
		seller.setName("Martha Wayne");
		sellerdao.update(seller);
		System.out.println("Update complete");

	}

}
