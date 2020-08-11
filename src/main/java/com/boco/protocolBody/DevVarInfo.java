package com.boco.protocolBody;

import java.io.Serializable;

public class DevVarInfo implements Serializable {

    private static final long serialVersionUID = 4345461957013373625L;

    /**
     * 设备变量类型id
     */
    private String   devVarTypeId;
    /**
     * 设备变量类型描述
     */
    private String   devVarTypeDesc;
    /**
     * 设备变量值（设备命令下发值或设备变量采集值）,具体内容根据devvartypeid来决定
     */
    private String   devVarValue;
    /**
     * 设备变量分组编码
     */
    private String   devVarGroupId;

    public String getDevVarTypeId() {
        return devVarTypeId;
    }

    public void setDevVarTypeId(String devVarTypeId) {
        this.devVarTypeId = devVarTypeId;
    }

    public String getDevVarTypeDesc() {
        return devVarTypeDesc;
    }

    public void setDevVarTypeDesc(String devVarTypeDesc) {
        this.devVarTypeDesc = devVarTypeDesc;
    }

    public String getDevVarValue() {
        return devVarValue;
    }

    public void setDevVarValue(String devVarValue) {
        this.devVarValue = devVarValue;
    }

    public String getDevVarGroupId() {
        return devVarGroupId;
    }

    public void setDevVarGroupId(String devVarGroupId) {
        this.devVarGroupId = devVarGroupId;
    }
}
