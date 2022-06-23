package com.summer.shardingSphere.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lijiawei
 */
@Data
@TableName(value = "`user`")
public class User {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "sex")
    private Byte sex;

    @TableField(value = "phone")
    private String phone;
}