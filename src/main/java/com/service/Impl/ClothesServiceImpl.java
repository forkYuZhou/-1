package com.service.Impl;

import com.mapper.ClothesMapper;
import com.model.ClothesModel;
import com.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by orw on 2019/11/26.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ClothesServiceImpl implements ClothesService {

    @Autowired
    private ClothesMapper clothesMapper;

    @Override
    public List<ClothesModel> getClothesList() {
        List<ClothesModel> clothesList = clothesMapper.getClothesList();
        return clothesList;
    }
}
