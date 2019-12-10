package com.sus.service;

import com.sus.bean.Dormitory;
import com.sus.bean.Floor;

import java.util.List;

public interface DormitoryService {
    List<Floor> getFloor();

    List<Dormitory> getDormitory(int floor_Id);

    List<Dormitory> getDormitories(Integer floor_Id);

    List<Floor> getDormitories();

    List<Dormitory> showAll(Integer floorId);

    boolean checkDormitoryName(String dormitoryName,Integer floorId);

    void saveDormitory(Dormitory dormitory, Integer floorId);

    void saveDormitory(Dormitory dormitory);

    Dormitory getUpdateDormitory(Integer dormitoryId);

    void updateDormitory(Integer dormitoryId, String dormitoryName);

    void deleteDormitory(Integer dormitoryId);

    void deleteBath(List<Integer> del_dormitoryIds);
}
