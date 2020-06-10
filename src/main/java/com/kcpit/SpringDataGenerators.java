package com.kcpit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kcpit.entities.CustomerDtlsEntity;
import com.kcpit.repositories.CustomerRepository;

@SpringBootApplication
public class SpringDataGenerators {

	public static void main(String[] args) {
		ApplicationContext context=null;
		context=SpringApplication.run(SpringDataGenerators.class, args);
		 CustomerRepository custoRepo = context.getBean(CustomerRepository.class);
		 CustomerDtlsEntity entity=new CustomerDtlsEntity();
		// entity.setCustomerId(102);
		 entity.setCustomerName("kalia");
		 entity.setCustomerEmail("kalia@gmail.com");
		CustomerDtlsEntity saveData = custoRepo.save(entity);
		System.out.println(saveData);
	}

}
