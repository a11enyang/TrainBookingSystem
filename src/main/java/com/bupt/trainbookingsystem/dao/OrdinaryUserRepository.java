package com.bupt.trainbookingsystem.dao;

import com.bupt.trainbookingsystem.entity.OrdinaryUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdinaryUserRepository extends JpaRepository<OrdinaryUserEntity,Integer> {

    @Query("select t from OrdinaryUserEntity t where t.name=?1 and t.password=?2")
    public OrdinaryUserEntity TrygetUser(String name,String password);

    @Query("select t from OrdinaryUserEntity t where t.name=?1")
    public OrdinaryUserEntity finduserbyname(String name);
}