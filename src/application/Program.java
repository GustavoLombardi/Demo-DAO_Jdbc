package application;

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
		Department department = new Department(4, null);

		List<Seller> list = sellerdao.findByDepartment(department);

		for (Seller obj : list) {

			System.out.println(obj);

		}

		}

	}


