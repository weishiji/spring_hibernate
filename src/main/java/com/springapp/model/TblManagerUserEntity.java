package com.springapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lxg on 4/29/15.
 */
@Entity
@Table(name = "tbl_manager_user", schema = "", catalog = "ota")
public class TblManagerUserEntity {
    private long uid;
    private String name;
    private String pass;
    private String display;
    private Byte statu;
    private Timestamp addtime;

    @Id
    @Column(name = "UID")
    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
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
    @Column(name = "pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "display")
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Basic
    @Column(name = "statu")
    public Byte getStatu() {
        return statu;
    }

    public void setStatu(Byte statu) {
        this.statu = statu;
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

        TblManagerUserEntity that = (TblManagerUserEntity) o;

        if (uid != that.uid) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;
        if (display != null ? !display.equals(that.display) : that.display != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;
        if (statu != null ? !statu.equals(that.statu) : that.statu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (uid ^ (uid >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (display != null ? display.hashCode() : 0);
        result = 31 * result + (statu != null ? statu.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }
}
