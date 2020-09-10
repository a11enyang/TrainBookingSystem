package com.bupt.trainbookingsystem.service.imp;

import com.bupt.trainbookingsystem.dao.TripWorstRepository;
import com.bupt.trainbookingsystem.entity.logResult.TripWorstEntity;
import com.bupt.trainbookingsystem.service.TripWorstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripWorstServiceImp implements TripWorstService {
    public final TripWorstRepository tripWorstRepository;

    public TripWorstServiceImp(TripWorstRepository tripWorstRepository) {
        this.tripWorstRepository = tripWorstRepository;
    }

    @Override
    public List<TripWorstEntity> findAll() {
        return tripWorstRepository.findAllNew();
    }
}
