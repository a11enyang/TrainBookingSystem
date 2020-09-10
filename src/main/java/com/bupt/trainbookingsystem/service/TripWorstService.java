package com.bupt.trainbookingsystem.service;

import com.bupt.trainbookingsystem.entity.logResult.TripBestEntity;
import com.bupt.trainbookingsystem.entity.logResult.TripWorstEntity;

import java.util.List;

public interface TripWorstService {
    List<TripWorstEntity> findAll();
}
