package com.optimize.code.goodcase.choice.choice3;

/**
 * @author rockyluo
 * @date 2020-03-22 18:17
 *
 **/

public class ChoiceCode {

    public static String choice3(String type){
        return TypeFactory.getStrategy(type).getType();
    }
}
