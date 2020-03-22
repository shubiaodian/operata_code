package com.optimize.code.goodcase.choice.choice4;

/**
 * @author rockyluo
 * @date 2020-03-22 18:17
 *
 **/

public class ChoiceCode {

    public static String choice4(String type){

        return TypeEnum.getTypeEnumFromValue(type).getType();
    }
}
