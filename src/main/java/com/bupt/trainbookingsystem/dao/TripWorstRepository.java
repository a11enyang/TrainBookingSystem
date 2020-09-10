package com.bupt.trainbookingsystem.dao;
import com.bupt.trainbookingsystem.entity.logResult.TripBestEntity;
import com.bupt.trainbookingsystem.entity.logResult.TripWorstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface TripWorstRepository extends JpaRepository<TripWorstEntity,Integer> {
    @Query(value="select * from tripWorst order by times DESC",nativeQuery=true)
    List<TripWorstEntity> findAllNew();
}
