package com.bupt.trainbookingsystem.dao;

import com.bupt.trainbookingsystem.entity.LogResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogResultRepository extends JpaRepository<LogResultEntity,Integer> {
    LogResultEntity findLogResultEntityByUsername(String username);
}
