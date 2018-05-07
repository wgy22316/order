package com.my.order.dadaobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class SellerInfo {

    /**
     *
     */
    @Id
    private String id;

    /**
     *用户名字
     */
    private String userame;

    /**
     *用户密码
     */
    private String password;

    /**
     *微信openid
     */
    private String openid;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *修改时间
     */
    private Date updateTime;
}
