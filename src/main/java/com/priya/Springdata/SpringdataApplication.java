package com.priya.Springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.priya.Springdata.Repository.StudentRepository;
import com.priya.Springdata.entity.Student;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}
	@Autowired
	private StudentRepository studrepo;
	@Override
	public void run(String... args) throws Exception
	{
		studrepo.save(new Student(1,"Ayyappa",100));
		studrepo.save(new Student(2,"Shanmugam",90));
	}

}
