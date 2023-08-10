package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();


//        obj.name = "ahinsak";
//        System.out.println(obj.name);
//
//        error
//        java: name has private access in com.driver.RWOnly
//        as name is private data member so we can not accesss it using dot operator
        obj.setName("ahinsak");
        String name = obj.getName();
//        System.out.println(obj.getName());

    }
  
}