package com.sus.dao;

import com.sus.bean.Dormitory;
import com.sus.bean.DormitoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DormitoryMapper {
    long countByExample(DormitoryExample example);
    long countByExampleDormitory(@Param("dormitoryName")String  dormitoryName,@Param("floorId") Integer floorId);

    int deleteByExample(DormitoryExample example);

    int insert(Dormitory record);

    int insertSelective(Dormitory record);
    int insertSelectiveDormitory(Dormitory record,@Param("floorId") Integer floorId);

    List<Dormitory> selectByExample(DormitoryExample example);

    int insertSelectiveWithFloor(Dormitory record);

    List<Dormitory> selectByExampleWithFloor(DormitoryExample example);

    int updateByExampleSelective(@Param("record") Dormitory record, @Param("example") DormitoryExample example);

    int updateByExample(@Param("record") Dormitory record, @Param("example") DormitoryExample example);

    List<Dormitory> selectByExampleWith(int floor_Id);
    List<Dormitory> selectByExampleFloorWith(int floor_Id);

    Dormitory selectDormitoryId(Integer dormitoryId);

    void updateByExampleSelectiveWith(@Param("dormitoryId")Integer dormitoryId,@Param("dormitoryName") String dormitoryName);

    void deleteByPrimaryKey(Integer dormitoryId);
}