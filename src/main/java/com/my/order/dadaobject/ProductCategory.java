package com.my.order.dadaobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class ProductCategory {

    /**
     *类目id
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     *类目名字
     */
    private String categoryName;

    /**
     *类目编号
     */
    private Integer categoryType;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *更新时间
     */
    private Date updateTime;

}
