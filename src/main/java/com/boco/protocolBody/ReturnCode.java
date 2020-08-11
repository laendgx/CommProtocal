package com.boco.protocolBody;

/**
 * 返回值
 *
 */
public interface ReturnCode {

    /**
     * 发送成功
     */
    String ReturnCode_success = "000000";
    /**
     * 发送超时
     */
    String ReturnCode_overtime = "222222";
    /**
     * 数据格式非法
     */
    String ReturnCode_formaterror = "100000";
    /**
     * 无效请求类型
     */
    String ReturnCode_Invalid = "200000";
    /**
     * 未知错误
     */
    String ReturnCode_unknown = "111111";
    /**
     * websocket返回类型 状态反馈
     */
    String StatusDataReturn="statusDataReturn";
    /**
     * websocket返回类型 控制反馈
     */
    String DevCtrReturn="devCtrReturn";
    /**
     * websocket返回类型 连接反馈
     */
    String Connect_success="connect_success";
    /**
     * websocket返回类型 连接反馈
     */
    String Connect_heartbeat="connect_heartbeat";
}
