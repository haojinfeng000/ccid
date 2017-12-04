package com.sdlx.model;

import java.util.Date;

public class PlatRoleModuleInfo extends PlatRoleModuleInfoKey {
    private Integer isadd;

    private Integer isupd;

    private Integer isdel;

    private Date createDate;

    private Date updateDate;

    public Integer getIsadd() {
        return isadd;
    }

    public void setIsadd(Integer isadd) {
        this.isadd = isadd;
    }

    public Integer getIsupd() {
        return isupd;
    }

    public void setIsupd(Integer isupd) {
        this.isupd = isupd;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}