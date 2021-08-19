package com.spring.cloud.product.catalog.repository;

import com.spring.cloud.product.catalog.model.Product;
import org.springframework.data.repository.CrudRepository;
//import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    //List<Product> findByName(String name);

}

