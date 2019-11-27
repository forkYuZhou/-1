package com.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by liuqiangqiang_v on 2019/11/26.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClothesModel {
    @ApiModelProperty("主键Id")
    private Long id;
    @ApiModelProperty("名称")
    private String name;


}
