package com.github.wugenshui.yygh.service.hosp.controller;


import com.github.wugenshui.yygh.base.BaseEntity;
import com.github.wugenshui.yygh.entity.HospitalSet;
import com.github.wugenshui.yygh.service.hosp.service.HospitalSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 医院设置表 前端控制器
 * </p>
 *
 * @author chenbo
 * @since 2021-06-13
 */
@Api(tags = "医院设置")
@RestController
@RequestMapping("/admin/hosp/set")
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;

    @ApiOperation("查询列表")
    @GetMapping
    public List<HospitalSet> list() {
        return hospitalSetService.list();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Long id) {
        return hospitalSetService.removeById(id);
    }

}

