package com.bupt.trainbookingsystem.service;

import com.bupt.trainbookingsystem.entity.LogResultEntity;

public interface LogResultService {
    public LogResultEntity findLogResultEntityByUsername(String username);
    public String[] findLogResultByUsername(String username);
}
