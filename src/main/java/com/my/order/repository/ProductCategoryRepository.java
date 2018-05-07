package com.my.order.repository;

import com.my.order.dadaobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

    /**
     * 通过类型编号批量查询类型
     * @param categoryTypeList 类型编号List
     * @return
     */
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
