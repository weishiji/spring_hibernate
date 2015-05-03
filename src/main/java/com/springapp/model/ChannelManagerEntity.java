package com.springapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lxg on 4/29/15.
 */
@Entity
@Table(name = "channel_manager", schema = "", catalog = "ota")
public class ChannelManagerEntity {
    private int id;
    private Timestamp addtime;
    private String title;
    private int code;
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
    @Column(name = "addtime")
    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "code")
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

        ChannelManagerEntity that = (ChannelManagerEntity) o;

        if (code != that.code) return false;
        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + code;
        result = 31 * result + userId;
        return result;
    }
}
