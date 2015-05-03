package com.springapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lxg on 4/29/15.
 */
@Entity
@Table(name = "tbl_manager_role_permission", schema = "", catalog = "ota")
public class TblManagerRolePermissionEntity {
    private long id;
    private long rid;
    private long pid;
    private Timestamp addtime;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RID")
    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "PID")
    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "addtime")
    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblManagerRolePermissionEntity that = (TblManagerRolePermissionEntity) o;

        if (id != that.id) return false;
        if (pid != that.pid) return false;
        if (rid != that.rid) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (rid ^ (rid >>> 32));
        result = 31 * result + (int) (pid ^ (pid >>> 32));
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }
}
