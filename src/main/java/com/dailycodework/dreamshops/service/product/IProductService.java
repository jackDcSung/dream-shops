package com.dailycodework.dreamshops.service.product;


import com.dailycodework.dreamshops.dto.ProductDto;
import com.dailycodework.dreamshops.model.Product;
import com.dailycodework.dreamshops.requests.AddProductRequest;
import com.dailycodework.dreamshops.requests.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);


    Product getProductById(Long id);


    void deleteProductById(Long id);


    Product updateProduct(ProductUpdateRequest product, Long productId);

    List<Product> getAllProducts();
    List<Product> getProductsByName(String name);

    List<Product> getProductsByCategory(String category);

    List<Product> getAllProductsByBrand(String brand);


    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByBrandAndName(String category, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    Long countProductsByBrandAndName(String brand,String name);

    ProductDto convertToDto(Product product);
















}
