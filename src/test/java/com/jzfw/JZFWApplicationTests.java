package com.jzfw;

import com.jzfw.bean.Order;
import com.jzfw.dao.OrderMapper;
import com.jzfw.service.IOrderService;
import com.jzfw.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JZFWApplicationTests {

    @Autowired
    private IOrderService orderService;
    @Autowired
    private OrderMapper orderMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void text(){
        System.out.println("李佳欣非要和我刚");
        //OrderController controller = new OrderController();
        orderService = new OrderServiceImpl();

        Order byId = orderMapper.selectByPrimaryKey(1034L);
        //Message byId = controller.findById(1034L);
        System.out.println(byId.toString());
    }

}
