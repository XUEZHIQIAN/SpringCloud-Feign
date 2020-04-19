package com.hang.cloud.service.impl;

import com.hang.cloud.service.BaseInfoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    @Override
    public String queryBaseInfoById(Long id) {
        return "Hang 0.0";
    }

}
