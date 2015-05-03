package com.springapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lxg on 4/29/15.
 */
@Entity
@Table(name = "action_log", schema = "", catalog = "ota")
public class ActionLogEntity {
    private int id;
    private Timestamp actionTime;
    private Integer actionType;
    private int packageId;
    private int userId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "action_time")
    public Timestamp getActionTime() {
        return actionTime;
    }

    public void setActionTime(Timestamp actionTime) {
        this.actionTime = actionTime;
    }

    @Basic
    @Column(name = "action_type")
    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    @Basic
    @Column(name = "package_id")
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActionLogEntity that = (ActionLogEntity) o;

        if (id != that.id) return false;
        if (packageId != that.packageId) return false;
        if (userId != that.userId) return false;
        if (actionTime != null ? !actionTime.equals(that.actionTime) : that.actionTime != null) return false;
        if (actionType != null ? !actionType.equals(that.actionType) : that.actionType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (actionTime != null ? actionTime.hashCode() : 0);
        result = 31 * result + (actionType != null ? actionType.hashCode() : 0);
        result = 31 * result + packageId;
        result = 31 * result + userId;
        return result;
    }
}
