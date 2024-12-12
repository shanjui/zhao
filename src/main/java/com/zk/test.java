package com.zk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;


/**
 * @author: zk
 * @create 2024-09-06 23:28
 */
public class test {

    public static void main(String[] args) {
//        //两个线程交替打印 100个数字，a线程打印奇数，b线程打印偶数
//        //定义2个信号量 给a设置1个计数器 先让a执行
//        System.out.println("开始");
//        Semaphore a=new Semaphore(1);
//        Semaphore b=new Semaphore(0);
//        Thread t1=new Thread(()->{
//            for (int i = 1; i < 100; i+=2) {
//                try {
//                    //a的计数器为0的时候 就回一直阻塞
//                    a.acquire();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("线程一" + i);
//                //b的计数器加1
//                b.release();
//            }
//        });
//        Thread t2=new Thread(()->{
//            for (int i = 2; i <=100 ; i+=2) {
//                try {
//                    //b的计数器为0的时候 就会一直阻塞
//                    b.acquire();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(i);
//                //a的计数器加1
//                a.release();
//            }
//        });
//        t1.start();
//        t2.start();

//        String jsonStr = "{\"charge_total\":\"2\"}";
//        // 解析 JSON 字符串为 JSONObject
//        JSONObject jsonObject = JSON.parseObject(jsonStr);
//        // 提取 charge_total 字段并转换为 double
//        String chargeTotalStr = jsonObject.getString("charge_total");
//        double chargeTotalValue = Double.parseDouble(chargeTotalStr);
//        System.out.println(chargeTotalValue);  // 输出 2.0


        BigDecimal totalFirstTimeAmount = BigDecimal.valueOf(1.3456);
        totalFirstTimeAmount = totalFirstTimeAmount.multiply(new BigDecimal("10000"));
        System.out.println(totalFirstTimeAmount);



    }

//    public static ListNode reverseListIterative(ListNode head) {
//        ListNode prev = null; //前指针节点
//        ListNode curr = head; //当前指针节点
//        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
//        while (curr != null) {
//            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
//            curr.next = prev; //将当前节点指向它前面的节点
//            prev = curr; //前指针后移
//            curr = nextTemp; //当前指针后移
//        }
//        return prev;
//    }


}
