package com.bupt.trainbookingsystem.service.imp;

import com.bupt.trainbookingsystem.dao.TripBestRepository;
import com.bupt.trainbookingsystem.entity.logResult.TripBestEntity;
import com.bupt.trainbookingsystem.service.TripBestService;
import com.bupt.trainbookingsystem.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripBestServiceImp implements TripBestService {
    private final TripBestRepository tripBestRepository;

    public TripBestServiceImp(TripBestRepository tripBestRepository) {
        this.tripBestRepository = tripBestRepository;
    }


    @Override
    public List<TripBestEntity> findAll() {
        return tripBestRepository.findAllNew();
    }

}
