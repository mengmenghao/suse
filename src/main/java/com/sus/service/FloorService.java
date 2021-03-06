package com.sus.service;

import com.sus.bean.Floor;

import java.util.List;

public interface FloorService {
    List<Floor> showAll();

    void saveFloor(Floor floor);

    boolean checkFloorName(String floorName);

    Floor getUpdateFloor(Integer floorId);

    void updateFloor(Floor floor);

    void deleteFloor(Integer floorId);

    void deleteBath(List<Integer> delFloorIds);
}
