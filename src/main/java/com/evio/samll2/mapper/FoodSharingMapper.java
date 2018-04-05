package com.evio.samll2.mapper;

import com.evio.samll2.pojo.FoodSharing;
import com.evio.samll2.pojo.FoodSharingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FoodSharingMapper {
    int countByExample(FoodSharingExample example);

    int deleteByExample(FoodSharingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FoodSharing record);

    int insertSelective(FoodSharing record);

    List<FoodSharing> selectByExample(FoodSharingExample example);

    FoodSharing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FoodSharing record, @Param("example") FoodSharingExample example);

    int updateByExample(@Param("record") FoodSharing record, @Param("example") FoodSharingExample example);

    int updateByPrimaryKeySelective(FoodSharing record);

    int updateByPrimaryKey(FoodSharing record);
}