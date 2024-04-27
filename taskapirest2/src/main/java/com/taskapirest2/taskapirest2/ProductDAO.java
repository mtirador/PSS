package com.taskapirest2.taskapirest2;

import java.util.List;

public interface ProductDAO {
    Product searchById(int id);
    List<Product> findAllDao();
    public void saveProductDao(Product product);
    public void updateProductDao(Product product);
    public void deleteProductDao(Product product);
}
