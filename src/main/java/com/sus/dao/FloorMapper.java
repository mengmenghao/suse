package com.sus.dao;

import com.sus.bean.Floor;
import com.sus.bean.FloorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FloorMapper {
    long countByExample(FloorExample example);

    int deleteByExample(FloorExample example);

    int insert(Floor record);

    int insertSelective(Floor record);

    List<Floor> selectByExample(FloorExample example);

    List<Floor> selectByExampleDormitory(FloorExample example);

    int updateByExampleSelective(@Param("record") Floor record, @Param("example") FloorExample example);

    int updateByExample(@Param("record") Floor record, @Param("example") FloorExample example);

    List<Floor> selectFloor();

    Floor selectFloorId(Integer floorId);

    void updateByPrimaryKeySelective(Floor floor);

    void deleteByPrimaryKey(Integer floorId);
}