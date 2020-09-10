package com.bupt.trainbookingsystem.service.imp;

import com.bupt.trainbookingsystem.dao.LogResultRepository;
import com.bupt.trainbookingsystem.entity.LogResultEntity;
import com.bupt.trainbookingsystem.service.LogResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class logResultImp implements LogResultService {
    public final LogResultRepository logResultRepository;

    public logResultImp(LogResultRepository logResultRepository) {
        this.logResultRepository = logResultRepository;
    }

    @Override
    public LogResultEntity findLogResultEntityByUsername(String username) {
        return logResultRepository.findLogResultEntityByUsername(username);
    }

    @Override
    public String[] findLogResultByUsername(String username) {
        LogResultEntity logResultEntity = logResultRepository.findLogResultEntityByUsername(username);
        return logResultEntity.getOps().split("/");
    }
}
