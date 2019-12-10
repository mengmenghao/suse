package com.sus.service.impl;

import com.sus.bean.Dormitory;
import com.sus.bean.DormitoryExample;
import com.sus.bean.Floor;
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
    public List<Floor> getDormitories() {
//        FloorExample floorExample=new FloorExample();
//        FloorExample.Criteria criteria = floorExample.createCriteria();
//        criteria.andFloorIdEqualTo();
        List<Floor> floors = floorMapper.selectByExampleDormitory(null);
        return floors;
    }

    /**
     * 根据楼栋ID查询寝室
     * @param floorId
     * @return
     */
    @Override
    public List<Dormitory> showAll(Integer floorId) {
        List<Dormitory> dormitories=dormitoryMapper.selectByExampleFloorWith(floorId);
        return dormitories;
    }

    /**
     * 检查寝室名是否可用
     *
     * @param floorId
     * @param dormitoryName
     * @return
     */
    @Override
    public boolean checkDormitoryName(String  dormitoryName,Integer floorId) {
        long count = dormitoryMapper.countByExampleDormitory(dormitoryName,floorId);
        return count==0;
    }

    @Override
    public void saveDormitory(Dormitory dormitory, Integer floorId) {

    }

    /**
     * 添加寝室
     * @param dormitory
     */
    @Override
    public void saveDormitory(Dormitory dormitory) {
        dormitoryMapper.insertSelective(dormitory);
    }

    /**
     * 修改时查询原信息
     * @param dormitoryId
     * @return
     */
    @Override
    public Dormitory getUpdateDormitory(Integer dormitoryId) {
        Dormitory dormitory=dormitoryMapper.selectDormitoryId(dormitoryId);
        return dormitory;
    }

    /**
     * 保存修改后的寝室
     * @param dormitoryId
     * @param dormitoryName
     */
    @Override
    public void updateDormitory(Integer dormitoryId, String dormitoryName) {
        dormitoryMapper.updateByExampleSelectiveWith(dormitoryId,dormitoryName);
    }

    /**
     * 单条删除
     * @param dormitoryId
     */
    @Override
    public void deleteDormitory(Integer dormitoryId) {
        dormitoryMapper.deleteByPrimaryKey(dormitoryId);
    }

    @Override
    public void deleteBath(List<Integer> del_dormitoryIds) {
        DormitoryExample example =new DormitoryExample();
        DormitoryExample.Criteria criteria = example.createCriteria();
        criteria.andDormitoryIdIn(del_dormitoryIds);
        dormitoryMapper.deleteByExample(example);

    }
}
