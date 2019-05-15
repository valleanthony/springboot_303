package com.example.springboot_303;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepo repo;

    @Override
    public void run(String... strings) throws Exception{

        Course course = new Course("Astrophysics","Neil D Tyson","Just a course on stars",3);
        repo.save(course);
        course = new Course("Boxing","Mike Tyson","Just a course on Knocking people out",3);
        repo.save(course);
        course = new Course("English","Chet Prior","Just a course that is a joke",5);
        repo.save(course);
    }


}
