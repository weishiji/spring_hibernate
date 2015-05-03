package com.springapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lxg on 4/29/15.
 */
@Entity
@Table(name = "tbl_manager_user_role", schema = "", catalog = "ota")
public class TblManagerUserRoleEntity {
    private long id;
    private long uid;
    private long rid;
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
    @Column(name = "UID")
    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
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

        TblManagerUserRoleEntity that = (TblManagerUserRoleEntity) o;

        if (id != that.id) return false;
        if (rid != that.rid) return false;
        if (uid != that.uid) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (uid ^ (uid >>> 32));
        result = 31 * result + (int) (rid ^ (rid >>> 32));
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }
}
