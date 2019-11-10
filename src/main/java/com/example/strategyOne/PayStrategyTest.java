package com.example.strategyOne;


import com.example.strategyOne.payport.AliPayment;
import com.example.strategyOne.payport.JdPayment;
import com.example.strategyOne.payport.PayType;

/**
 * @author: xiepanpan
 * @Date: 2019/11/9
 * @Description:
 */
public class PayStrategyTest {

    public static void main(String[] args) {
        //生成好的订单
        Order order = new Order("1","2019111100000000001",99.98);

        //下单
        System.out.println(order.pay(PayType.JD_PAY));

    }
}
