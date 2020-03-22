package com.optimize.code.goodcase.choice.choice1;

/**
 * @author rockyluo
 * @date 2020-03-22 18:17
 *
 *
 * 利用三元运算符，在if else分支较少的情况下
 **/

public class ChoiceCode {

    public static String choice1(String type){
        return "Integer".equals(type)?"this is Integer":null;
    }
}
