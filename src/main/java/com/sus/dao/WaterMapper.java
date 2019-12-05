package com.sus.dao;

import com.sus.bean.Water;
import com.sus.bean.WaterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterMapper {
    long countByExample(WaterExample example);

    int deleteByExample(WaterExample example);

    int insert(Water record);

    int insertSelective(Water record);

    List<Water> selectByExample(WaterExample example);

    int updateByExampleSelective(@Param("record") Water record, @Param("example") WaterExample example);

    int updateByExample(@Param("record") Water record, @Param("example") WaterExample example);
}