package com.springapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lxg on 4/29/15.
 */
@Entity
@Table(name = "tbl_manager_permission", schema = "", catalog = "ota")
public class TblManagerPermissionEntity {
    private long pid;
    private String pname;
    private String url;
    private Timestamp addtime;

    @Id
    @Column(name = "PID")
    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pname")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

        TblManagerPermissionEntity that = (TblManagerPermissionEntity) o;

        if (pid != that.pid) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pid ^ (pid >>> 32));
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }
}
