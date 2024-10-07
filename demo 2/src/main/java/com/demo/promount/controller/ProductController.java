package com.demo.promount.controller;

import com.demo.promount.dto.TotalOrdersDTO;
import com.demo.promount.entities.Products;
import com.demo.promount.repo.ProductsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.ScatteringByteChannel;

@Slf4j
@RestController("/")
public class ProductController {

    ProductsRepo productsRepo = new ProductsRepo();

    @PostMapping("/createProduct")
    public String createProductEntry(@RequestBody Products products){
        Products productToCreate = new Products();
        try {
            productToCreate.setName(products.getName());
            productToCreate.setVendorId(products.getVendorId());
            productToCreate.setPrice(products.getPrice());
            productToCreate.setStatus(products.getStatus());
            productToCreate.setProductImage(products.getProductImage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        return productsRepo.save(productToCreate)?"success":"fail";
    }

    @PutMapping("/updateProduct/{Id}")
    public String updateProduct(@RequestBody Products products){
            boolean updateCall = false;
            Integer id=;
            Products productToUpdate = productsRepo.getProductById(id);
        try {
            productToUpdate.setName(products.getName());
            productToUpdate.setVendorId(products.getVendorId());
            productToUpdate.setPrice(products.getPrice());
            productToUpdate.setStatus(products.getStatus());
            productToUpdate.setProductImage(products.getProductImage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        return productsRepo.save(productToUpdate)?"success":"fail";
    }
    @DeleteMapping("/deleteProduct/{Id}")
    public String deleteProduct(@RequestBody Integer id){
        boolean deleteCall = false;
        try {
            productsRepo.deleteProductEntry(id);
                deleteCall=true;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return deleteCall?"success":"fail";
    }
    @RequestMapping("/ordersByContinent/{continentName}")
    public TotalOrdersDTO getTotalOrders(){

    }
}
