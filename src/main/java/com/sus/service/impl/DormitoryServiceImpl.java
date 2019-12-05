package com.sus.service.impl;

import com.sus.bean.Dormitory;
import com.sus.bean.Floor;
import com.sus.bean.FloorExample;
import com.sus.dao.DormitoryMapper;
import com.sus.dao.FloorMapper;
import com.sus.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    private DormitoryMapper dormitoryMapper;
    @Autowired
    private FloorMapper floorMapper;
    @Override
    public List<Floor> getFloor() {
        List<Floor> list = floorMapper.selectByExample(null);
        return list;
    }

    @Override
    public List<Dormitory> getDormitory(int floor_Id) {
        List<Dormitory> list = dormitoryMapper.selectByExampleWith(floor_Id);
        return list;
    }

    @Override
    public List<Dormitory> getDormitories(Integer floor_Id) {
        List<Dormitory> list = dormitoryMapper.selectByExampleFloorWith(floor_Id);
        return list;
    }

    @Override
    public List<Floor> getDormitoriess() {
//        FloorExample floorExample=new FloorExample();
//        FloorExample.Criteria criteria = floorExample.createCriteria();
//        criteria.andFloorIdEqualTo();
        List<Floor> floors = floorMapper.selectByExampleDormitory(null);
        return floors;
    }
}
