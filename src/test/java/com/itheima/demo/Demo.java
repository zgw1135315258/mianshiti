package com.itheima.demo;

import com.itheima.domain.User;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer, User> users = new HashMap<Integer, User>();
        users.put(1,new User("张三",25));
        users.put(3,new User("李四",22));
        users.put(2,new User("王五",28));

        System.out.println(users);

        HashMap<Integer, User> sort = sortSmToBig(users);
        System.out.println(sort);
        HashMap<Integer, User> integerUserHashMap = sortBigToSm(users);
        System.out.println(integerUserHashMap);

    }

    public static HashMap<Integer, User> sortSmToBig(HashMap<Integer, User> map){
       Set<Map.Entry<Integer, User>> entrySet = map.entrySet();

       ArrayList<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer, User>>(entrySet);

       Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
           public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o1.getValue().getAge()-o2.getValue().getAge();
           }
       });

        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();

        for (Map.Entry<Integer, User> integerUserEntry : list) {
           linkedHashMap.put(integerUserEntry.getKey(),integerUserEntry.getValue());
       }
       return linkedHashMap;



    }

    public static HashMap<Integer,User> sortBigToSm(HashMap<Integer,User> map){
        Set<Map.Entry<Integer, User>> entries = map.entrySet();

        ArrayList<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer, User>>(entries);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {

                return o2.getValue().getAge()-o1.getValue().getAge();
            }
        });

        LinkedHashMap<Integer, User> integerUserLinkedHashMap = new LinkedHashMap<Integer, User>();
        for (Map.Entry<Integer, User> integerUserEntry : list) {

            integerUserLinkedHashMap.put(integerUserEntry.getKey(),integerUserEntry.getValue());
        }
        return integerUserLinkedHashMap;
    }


}
