package com.example.springboot_303;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository <Course,Long> {

}
