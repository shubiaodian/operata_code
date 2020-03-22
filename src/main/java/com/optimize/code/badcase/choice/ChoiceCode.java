package com.optimize.code.badcase.choice;

/**
 * @author rockyluo
 * @date 2020-03-22 20:35
 *
 * if else 是开发中经常用到的代码，简单的if else用起来确实很方便，但是一堆if else会让逻辑看起来混乱
 **/
public class ChoiceCode {
    public static void main(String[] args){
        System.out.println(choice1("String"));
    }


    public static String choice1(String type){
        if("Integer".equals(type)){
            return "this is Integer";
        }
        return null;
    }

    public static String choice2(String type){
        if("Integer".equals(type)){
            return "this is Integer";
        }
        if("Long".equals(type)){
            return "this is Long";
        }
        if("String".equals(type)){
            return "this is String";
        }
        else {
            return "null";
        }
    }


    public static String choice3(String type){
        if("Integer".equals(type)){
            return "this is Integer";
        }
        if("Long".equals(type)){
            return "this is Long";
        }
        if("String".equals(type)){
            return "this is String";
        }
        else {
            return "null";
        }
    }

    public static String choice4(String type){
        if("Integer".equals(type)){
            return "this is Integer";
        }
        if("Long".equals(type)){
            return "this is Long";
        }
        if("String".equals(type)){
            return "this is String";
        }
        else {
            return "null";
        }
    }
}
