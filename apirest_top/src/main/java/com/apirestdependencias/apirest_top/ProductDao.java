package com.apirestdependencias.apirest_top;

import java.util.List;

public interface ProductDao {

    Product findIdDao(int id);
    List<Product> findAllDao();
    public void saveDao(Product product);
    public void updateDao(Product product);
    public void deleteDao(Product product);
}
