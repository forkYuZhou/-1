package com.service.Impl;

import com.exception.BusinessErrorCode;
import com.exception.ClothesException;
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
    public List<ClothesModel> getClothesList() throws Exception {
        List<ClothesModel> clothesList = clothesMapper.getClothesList();
        if (clothesList.isEmpty()) {
            throw new ClothesException(BusinessErrorCode.CLUTHER_IS_NULL
                    .getReasonPhrase());
        }
        return clothesList;
    }
}
