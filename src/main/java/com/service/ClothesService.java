package com.service;

import com.exception.ClothesException;
import com.model.ClothesModel;

import java.util.List;

/**
 * Created by liuqiangqiang_v on 2019/11/26.
 */
public interface ClothesService {

    /**
     * 获取列表
     * @return
     */
    List<ClothesModel> getClothesList() throws  Exception;
}
