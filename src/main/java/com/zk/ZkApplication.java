package com.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * @author: zk
 * @create 2024-08-09 18:15
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZkApplication {
//    public static void main(String[] args) {
//        //SpringApplication.run(ZkApplication.class, args);
//        String s = "azzass";
//        System.out.println("结果：：：：：："+lengthOfLongestSubstring(s));
//    }
//
//    public static int lengthOfLongestSubstring(String s) {
//        int[] last = new int[128];
//        int res = 0;
//        int start = 0;
//        for (int i = 0; i < s.length(); i++) {
//            //获取ASCII码值
//            int index = s.charAt(i);
//            //这两个是比较位置信息，start=记录出现重复元素的开始位置
//            start = Math.max(start, last[index]);
//            //res表示前面出现的最大不重复   i - start + 1表示后面出现的最大不重复
//            res = Math.max(res, i - start + 1);
//            System.out.println("index="+index+"   start="+start+"   last[index]="+last[index]+"   res="+res);
//            //记录数组位置元素出现的位置
//            last[index] = i + 1;
//        }
//        return res;
//    }


//    public static void main(String[] args) {
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
//    }




    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);	//创建链表对象 l1 （对应有参 和 无参 构造方法）
        l1.add(3);				//插入结点，打印
        l1.add(5);
        //l1.print();

        ListNode l2 = new ListNode(1);	//创建链表对象 l1 （对应有参 和 无参 构造方法）
        l2.add(2);				//插入结点，打印
        l2.add(6);
        //l2.print();
        ListNode listNode = mergeTwoLists(l1, l2);
        listNode.print();
    }

    //l1=[1,3,5]  l2=[1,2,6]
    //解法思路：首先从两个链表头部比较出最小的值，将该链表的指针赋值给中间的链表指针，如上所示将l2赋值给新链表的头部
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){ return list2;}
        if(list2==null){ return list1;}
        ListNode prev = list1.val < list2.val? list1:list2;
        prev.print();
        prev.next = mergeTwoLists(prev.next,list1.val>=list2.val?list1:list2);
        return prev;
    }



}
class ListNode {
    int val;

    ListNode next;	// 结点 node
    ListNode(int x){	//可以定义一个有参构造方法，也可以定义一个无参构造方法
        val = x;
    }

    // 添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if(this.next == null) {
            this.next = newNode;
        }else{
            this.next.add(newval);}
    }
    // 打印链表
    public void print() {
        System.out.print(this.val);
        if(this.next != null)
        {
            System.out.print("-->");
            this.next.print();
        }
    }

}