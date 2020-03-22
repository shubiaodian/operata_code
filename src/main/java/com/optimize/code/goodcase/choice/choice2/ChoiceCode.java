package com.optimize.code.goodcase.choice.choice2;

/**
 * @author rockyluo
 * @date 2020-03-22 18:17
 *
 **/

public class ChoiceCode {

    public static void main(String[] args){
        System.out.println(choice1("String"));
    }

    public static String choice1(String type) {
        TypeEnum typeEnum = TypeEnum.getTypeEnumFromValue(type);
        switch (typeEnum.getCode()) {
            case 1:
                return "this is Integer";
            case 2:
                return "this is Long";
            case 3:
                return "this is String";
            default:
                return "null";
        }
    }
}
