package com.bupt.trainbookingsystem.dao;

import com.bupt.trainbookingsystem.entity.logResult.LogResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LogResultRepository extends JpaRepository<LogResultEntity,Integer> {
    LogResultEntity findLogResultEntityByUsername(String username);
}
