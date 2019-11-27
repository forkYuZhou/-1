package com.controller;

import com.exception.ClothesException;
import com.model.ClothesModel;
import com.service.ClothesService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author liuqiangqiang_v
 * @date 2019/11/26
 *
 */
@RestController
public class ClothesContraller {

    @Autowired
    private ClothesService clothesService;

    @ApiOperation(value = "倚天洗衣列表查询", notes = "倚天洗衣列表查询")
    @GetMapping(value = "/v1/project/list", produces = {"application/json;charset=utf-8"})
    public ResponseEntity<List<ClothesModel>> getClothesList() throws Exception {
        return ResponseEntity.ok(clothesService.getClothesList());
    }

}
