package com.koala.java;

import java.util.HashSet;

/**
 * day05：Records二次预览
 * Create by koala on 2021-08-16
 */
public class RecordTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("罗密欧",new Customer("朱丽叶",null));

        System.out.println(cust1.toString());

        System.out.println(cust1.name());//类似于原有的针对于实例变量的get()
        System.out.println(cust1.partner());//类似于原有的针对于实例变量的get()

        HashSet<Customer> set = new HashSet<>();
        set.add(cust1);

        Customer cust2 = new Customer("罗密欧",new Customer("朱丽叶",null));
        set.add(cust2);

        set.forEach(System.out::println);
    }
}
