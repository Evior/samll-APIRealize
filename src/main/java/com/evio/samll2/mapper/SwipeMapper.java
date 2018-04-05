package com.evio.samll2.mapper;

import com.evio.samll2.pojo.Swipe;
import com.evio.samll2.pojo.SwipeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SwipeMapper {
    int countByExample(SwipeExample example);

    int deleteByExample(SwipeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Swipe record);

    int insertSelective(Swipe record);

    List<Swipe> selectByExample(SwipeExample example);

    Swipe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Swipe record, @Param("example") SwipeExample example);

    int updateByExample(@Param("record") Swipe record, @Param("example") SwipeExample example);

    int updateByPrimaryKeySelective(Swipe record);

    int updateByPrimaryKey(Swipe record);
}