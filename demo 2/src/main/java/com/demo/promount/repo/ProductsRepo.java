package com.demo.promount.repo;

import com.demo.promount.entities.Products;
import jakarta.persistence.NamedNativeQuery;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.annotation.Native;

@Repository
public class ProductsRepo implements CrudRepository<Integer, Products> {

    @Query(value = "select * from products where id=?1", nativeQuery = true)
    public Products getProductById(Integer id);


    @Modifying
    @Transactional
    @Query(value = "delete products where id=?1", nativeQuery = true)
    public void deleteProductEntry(Integer id);
}
