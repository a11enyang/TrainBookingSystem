package com.bupt.trainbookingsystem.dao;


import com.bupt.trainbookingsystem.entity.AdministratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 开发者：杨韦岽
 * 内容：管理员账户
 * 开发者：徐玉韬
 * 内容：登陆检测
 */
@Repository
public interface AdministratorRespository extends JpaRepository<AdministratorEntity, Integer> {
    AdministratorEntity findAdministratorEntityByNameAndPassword(String name,String password);
}