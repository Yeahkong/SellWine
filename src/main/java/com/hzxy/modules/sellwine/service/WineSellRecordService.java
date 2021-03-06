package com.hzxy.modules.sellwine.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzxy.common.utils.PageUtils;
import com.hzxy.modules.sellwine.entity.WineSellRecord;

import java.util.Map;

public interface WineSellRecordService extends IService<WineSellRecord> {

    PageUtils queryPage(Map<String,Object> params);

}
