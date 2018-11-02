package com.gurpreet.developer.demo;
//perform CRUD (create, read, update, and delete) on the Car entity.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
//A security relaxation measure that needs
//to be implemented in some APIs in order to let web browsers access them.
//However, when CORS is enabled by a back-end developer some security
//analysis needs to be done in order to ensure you're not relaxing
//your server security too much.
@CrossOrigin(origins = "http://localhost:4200")
//repo to do database queries,                      object, primitive type
public interface CarRepository extends JpaRepository<Car, Long> {
}

//JPA- base repository, spring data module, allows you to map a car to database.
