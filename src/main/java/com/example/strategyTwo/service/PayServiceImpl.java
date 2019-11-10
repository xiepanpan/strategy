package com.example.strategyTwo.service;

import com.example.strategyTwo.utils.PayStrategyFactory;
import org.springframework.stereotype.Service;

/**
 * @author: xiepanpan
 * @Date: 2019/11/10
 * @Description:  支付service
 */
@Service
public class PayServiceImpl extends AbstractPayService {
    /**
     * 支付前准备支付参数
     *
     * @param payFor
     */
    @Override
    public boolean prePay(String payFor) {
        PayStrategy payStrategy = PayStrategyFactory.getStrategy(this.payType);
        if (payStrategy == null) {
            System.out.printf("没有%s类型的支付策略...\r\n", this.payType);
            return false;
        }
        return payStrategy.prePay(payFor);
    }

    /**
     * 支付后处理支付回调结果
     *
     * @param payFor
     * @param isPaySuccess
     */
    @Override
    public void afterPay(String payFor, boolean isPaySuccess) {
        PayStrategy payStrategy = PayStrategyFactory.getStrategy(this.payType);
        payStrategy.afterPay(payFor, true);
    }
}