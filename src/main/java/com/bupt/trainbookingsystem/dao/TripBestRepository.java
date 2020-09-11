package com.bupt.trainbookingsystem.dao;

import com.bupt.trainbookingsystem.entity.TripEntity;
import com.bupt.trainbookingsystem.entity.logResult.TripBestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface TripBestRepository extends JpaRepository<TripBestEntity,Integer> {

    @Query(value="select * from trip_best order by times DESC",nativeQuery=true)
    List<TripBestEntity> findAllNew();
}
