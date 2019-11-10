package com.example.strategyOne;

/**
 * @author: xiepanpan
 * @Date: 2019/11/9
 * @Description:  支付状态
 */
public class PayState {

    /**
     * 状态码
     */
    private int code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "支付状态：["+ code + "]," + msg +
                ", 交易详情：" + data;
    }
}
