package com.sus.service;

import com.sus.bean.Dormitory;
import com.sus.bean.Floor;

import java.util.List;

public interface DormitoryService {
    List<Floor> getFloor();

    List<Dormitory> getDormitory(int floor_Id);

    List<Dormitory> getDormitories(Integer floor_Id);

    List<Floor> getDormitoriess();
}
