package com.bupt.trainbookingsystem.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "administrator", schema = "booking", catalog = "")
public class AdministratorEntity {
    private int id;
    private String name;
    private String password;
    private String staffId;
    private String userType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "staff_id")
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministratorEntity that = (AdministratorEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(staffId, that.staffId) &&
                Objects.equals(userType, that.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, staffId, userType);
    }
}