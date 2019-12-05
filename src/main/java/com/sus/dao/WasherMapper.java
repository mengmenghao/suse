package com.sus.dao;

import com.sus.bean.Washer;
import com.sus.bean.WasherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WasherMapper {
    long countByExample(WasherExample example);

    int deleteByExample(WasherExample example);

    int insert(Washer record);

    int insertSelective(Washer record);

    List<Washer> selectByExample(WasherExample example);

    int updateByExampleSelective(@Param("record") Washer record, @Param("example") WasherExample example);

    int updateByExample(@Param("record") Washer record, @Param("example") WasherExample example);
}