package com.github.wugenshui.yygh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import com.github.wugenshui.yygh.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 医院设置表
 * </p>
 *
 * @author chenbo
 * @since 2021-06-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("hospital_set")
@ApiModel(value = "Set对象", description = "医院设置表")
public class HospitalSet extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    @ApiModelProperty(value = "签名秘钥")
    private String signKey;

    @ApiModelProperty(value = "统一挂号平台api地址")
    private String apiUrl;

}
