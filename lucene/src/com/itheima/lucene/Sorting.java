package com.itheima.lucene;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 1, 8, 4};
        sort4(a);
    //    sort2(a);


    }


    public static void sort4(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
              temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void sort3(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        System.out.println(list);
    }


    //直接排序
    //双重for循环，数组的第一个数a[0]和后面所有的数进行比对，
    // 得到最小的数，然后第二个数a[1]和后面所有的数进行比对，得到次小的数。。。反复后得到排序后的结果
    public static void sort1(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    System.out.println(a[j]);
                }
            }
        }
    }
    //冒泡排序,说明：冒泡排序是两两之间进行对比，
    // 如：4.2.5.1.7   ：第一次内循环、4和2比-->2,4 、4和5比-->4,5、5和1比-->5,1、5和7比-->5,7。
    //　　这样最大的一个数就到了数组的最后，第二次进行比对的时候只要比数组长度-2次，
    // 就是<arr.length-1，即可得到次大的数，放在倒数第二的位置，如此反复得到排序后的数组。
    public static void sort2(int[] arr) {

            for(int x=0; x<arr.length-1; x++) {

           for(int y=0; y<arr.length-x-1; y++) {
                 if(arr[y]>arr[y+1]){
                     int temp = arr[y];
                    arr[y] = arr[y+1];
                     arr[y+1] = temp;
                     System.out.println( arr[y+1]);
                   }
                }
            }
        }

//插入排序，说明：插入排序和打牌一样，拿到一个数和前面已有的数进行对比，比前面的数小就放到前面，举例：4,2,5,1,7 :
//　　第一次内循环、拿到数a[1]=2,和a[0]=4进行对比，2小，换位置;
//　　第二次内循环、拿到数5，和4比，位置不变，if判断为false，则break，跳出内循环，进行下一次;
//　　第三次内循环、拿到数1，和5比，交换位置，1在和4比，交换位置，最后和2比，再次交换位置，得到结果，1,2,4,5,7;
public static void insertSort(int[] a) {
    for (int i = 1; i < a.length; i++) {
        for (int j = i; j > 0; j--) {
            if (a[j] < a[j - 1]) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }else break;
        }
    }
}


}
