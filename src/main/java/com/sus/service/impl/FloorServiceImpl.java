package com.sus.service.impl;

import com.sus.bean.Floor;
import com.sus.bean.FloorExample;
import com.sus.dao.FloorMapper;
import com.sus.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FloorServiceImpl implements FloorService {
    @Autowired
    FloorMapper floorMapper;

    /**
     * 查询所有楼栋
     * @return
     */
    @Override
    public List<Floor> showAll() {
        return floorMapper.selectFloor();
    }

    /**
     * 添加楼栋
     * @param floor
     */
    @Override
    public void saveSubscriber(Floor floor) {
        floorMapper.insertSelective(floor);
    }

    /**
     * 检查楼栋名是否可用
     * @param floorName
     * @return
     */
    @Override
    public boolean checkFloorName(String floorName) {
        FloorExample example = new FloorExample();
        FloorExample.Criteria criteria = example.createCriteria();
        criteria.andFloorNameEqualTo(floorName);
        long count = floorMapper.countByExample(example);
        return count==0;
    }

    /**
     * 根据ID查询楼栋
     * @param floorId
     * @return
     */
    @Override
    public Floor getUpdateFloor(Integer floorId) {
        Floor floor=floorMapper.selectFloorId(floorId);
        return floor;
    }

    /**
     * 修改楼栋信息
     * @param floor
     */
    @Override
    public void updateSubscriber(Floor floor) {
        floorMapper.updateByPrimaryKeySelective(floor);
    }

    /**
     * 单个楼栋删除
     * @param floorId
     */
    @Override
    public void deleteFloor(Integer floorId) {
        floorMapper.deleteByPrimaryKey(floorId);
    }

    /**
     * 多条删除
     * @param delFloorIds
     */
    @Override
    public void deleteBath(List<Integer> delFloorIds) {
        FloorExample example=new FloorExample();
        FloorExample.Criteria criteria = example.createCriteria();
        criteria.andFloorIdIn(delFloorIds);
        floorMapper.deleteByExample(example);
    }
}
