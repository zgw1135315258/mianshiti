package com.itheima.demo;

public class Demo2 {


    static int count = 0;//排列种类
    private static String[] mustExistNumber = new String[]{"1", "2", "2", "3", "4", "5"};

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 122345; i <= 543221; i++) {
            if (isValidNumber(String.valueOf(i))) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isValidNumber(String str) {
        // TODO Auto-generated method stub
        //检查是否包含12345这5个数字，不包含返回false
        for (String number : mustExistNumber) {
            if (str.indexOf(number) < 0) {
                return false;
            }
        }
        //检查是否有两个2,只有一个返回false
        if (str.lastIndexOf("2") == str.indexOf("2")) {
            return false;
        }
        //检查4在不在第3位，是返回false
        if (str.charAt(2) == '4') {
            return false;
        }
        //检查是否35在一起
        if (str.indexOf("35") >= 0 || str.indexOf("53") >= 0) {
            return false;
        }
        return true;
    }

}




