package com.example.strategyOne.payport;

public enum PayType {

    ALI_PAY(new AliPayment()),
    WECHAT_PAY(new WechatPayment()),
    UNION_PAY(new UnionPayment()),
    JD_PAY(new JdPayment());


    private Payment payment;

    PayType(Payment payment) {
        this.payment=payment;
    }

    public Payment get() {
        return this.payment;
    }
}
