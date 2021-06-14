package com.github.wugenshui.yygh.vo;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(description="医院设置表")
public class HospitalSetVO {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    @ApiModelProperty(value = "签名秘钥")
    private String signKey;

    @ApiModelProperty(value = "统一挂号平台api地址")
    private String apiUrl;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除(1:已删除，0:未删除)")
    private Integer isDeleted;

}
