package com.java.hw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class SolutionUse {
    public static int getNthNum(ArrayList array) {
        if(array == null) {
            return -1;
        }
        if(array.contains(2) && array.contains(5)) {
            return -1;
        }
        if(array.contains(6) && array.contains(9)) {
            return -1;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        getCombinedNumsArray(array, hashSet);
        for(int i=0; i<array.size();i++) {
            if(array.get(i).equals(2)){
                array.set(i, 5);
                getCombinedNumsArray(array, hashSet);
            }else if(array.get(i).equals(5)) {
                array.set(i, 2);
                getCombinedNumsArray(array, hashSet);
            }else if(array.get(i).equals(6)) {
                array.set(i, 9);
                getCombinedNumsArray(array, hashSet);
            }else if(array.get(i).equals(9)) {
                array.set(i, 6);
                getCombinedNumsArray(array, hashSet);
            }
        }
        ArrayList<Integer> resArray = new ArrayList<>();
        for(Integer i:hashSet) {
            resArray.add(i);
        }
        Collections.sort(resArray);
        System.out.println(resArray);
        int maxNum = 0;
        for(int i=0;i<array.size();i++) {
            if((int) array.get(i)==2) {
                maxNum = maxNum>5 ? maxNum : 5;
            }else if((int) array.get(i)==6) {
                maxNum = 9;
            }else {
                maxNum = maxNum > (int) array.get(i) ? maxNum : (int) array.get(i);
            }
        }
        return resArray.get(maxNum-1);
    }

    public static void getCombinedNumsArray(ArrayList list, HashSet hashSet) {
        int len = list.size();
        for(int i=0; i<len; i++) {
            hashSet.add((int) list.get(i));
            for(int j=0; j<len; j++) {
                if(j==i) {
                    continue;
                }
                hashSet.add((int) list.get(i)*10 + (int) list.get(j));
                for(int k=0;k<len;k++) {
                    if(k==i || k==j) {
                        continue;
                    }
                    hashSet.add((int)list.get(i)*100 + (int)list.get(j)*10 + (int)list.get(k));
                }
            }
        }
    }

    public static ArrayList getSingleNumsArray(String line) {
        String[] threeValues = line.split(" *, *");
        if(threeValues.length!=3) {
            return null;
        }else if(threeValues[0].equals(threeValues[1]) || threeValues[0].equals(threeValues[2])
                || threeValues[1].equals(threeValues[2])) {
            return null;
        }
        ArrayList res = new ArrayList<Integer>();
        for(String s:threeValues) {
            int num;
            try {
                num = Integer.parseInt(s);
            }catch(Exception e) {
                return null;
            }
            if(1 > num || num > 9) {
                return null;
            }
            res.add(num);
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine().trim();
        ArrayList singleNumsArray = getSingleNumsArray(line);
        System.out.println(getNthNum(singleNumsArray));
    }
}













