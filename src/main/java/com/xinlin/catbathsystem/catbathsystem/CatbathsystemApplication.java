package com.xinlin.catbathsystem.catbathsystem;

import com.xinlin.catbathsystem.catbathsystem.entity.Cat;
import com.xinlin.catbathsystem.catbathsystem.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class CatbathsystemApplication implements CommandLineRunner {
//
//	public static void main(String[] args) {
//		SpringApplication.run(CatbathsystemApplication.class, args);
//	}
//	@Autowired
//	private CatRepository catRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Cat cat1 = new Cat("Fishball","BSH","fishball@gmail.com");
//		catRepository.save(cat1);
//
//		Cat cat2 = new Cat("Bally","BSH","ballball@gmail.com");
//		catRepository.save(cat2);
//
//		Cat cat3 = new Cat("Miumiu","BSH","miumiu@gmail.com");
//		catRepository.save(cat3);
//
//	}
//}


@SpringBootApplication
public class CatbathsystemApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CatbathsystemApplication.class, args);
	}

}
