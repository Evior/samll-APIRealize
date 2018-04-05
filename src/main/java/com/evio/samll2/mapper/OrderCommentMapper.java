package com.evio.samll2.mapper;

import com.evio.samll2.pojo.OrderComment;
import com.evio.samll2.pojo.OrderCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderCommentMapper {
    int countByExample(OrderCommentExample example);

    int deleteByExample(OrderCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderComment record);

    int insertSelective(OrderComment record);

    List<OrderComment> selectByExample(OrderCommentExample example);

    OrderComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByExample(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByPrimaryKeySelective(OrderComment record);

    int updateByPrimaryKey(OrderComment record);
}