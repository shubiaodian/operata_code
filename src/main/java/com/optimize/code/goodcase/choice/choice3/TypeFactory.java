package com.optimize.code.goodcase.choice.choice3;

import java.util.HashMap;

/**
 * @author rockyluo
 * @date 2020-03-22 21:44
 **/
public class TypeFactory {
    public static HashMap<String,Strategy> strategys=new HashMap<String, Strategy>();
    static {
        strategys.put("Integer",new IntegerTypeStrategy());
        strategys.put("Long",new IntegerTypeStrategy());
        strategys.put("String",new IntegerTypeStrategy());
    }
    public static Strategy getStrategy(String type){
        return strategys.get(type);
    }
}
