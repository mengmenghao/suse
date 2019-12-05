package com.sus.dao;

import com.sus.bean.WaterCress;
import com.sus.bean.WaterCressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterCressMapper {
    long countByExample(WaterCressExample example);

    int deleteByExample(WaterCressExample example);

    int deleteByPrimaryKey(Integer watercressId);

    int insert(WaterCress record);

    int insertSelective(WaterCress record);

    List<WaterCress> selectByExample(WaterCressExample example);

    WaterCress selectByPrimaryKey(Integer watercressId);

    int updateByExampleSelective(@Param("record") WaterCress record, @Param("example") WaterCressExample example);

    int updateByExample(@Param("record") WaterCress record, @Param("example") WaterCressExample example);

    int updateByPrimaryKeySelective(WaterCress record);

    int updateByPrimaryKey(WaterCress record);
}