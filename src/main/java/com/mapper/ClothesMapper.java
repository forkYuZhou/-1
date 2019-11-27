package com.mapper;

import com.model.ClothesModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liuqiangqiang_v on 2019/11/26.
 */
@Mapper
public interface ClothesMapper {

     List<ClothesModel> getClothesList();


}
