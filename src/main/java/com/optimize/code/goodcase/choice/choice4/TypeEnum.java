package com.optimize.code.goodcase.choice.choice4;

import java.util.HashMap;

/**
 * @author rockyluo
 * @date 2020-03-22 21:09
 **/
public enum TypeEnum {
    NULL(-1,"null"){
        @Override
        public String getType() {
            return "";
        }
    },
    INTEGER(1,"Integer"){
        @Override
        public String getType() {
            return "this is Integer";
        }
    },
    LONG(2,"Long"){
        @Override
        public String getType() {
            return "this is Long";
        }
    },
    STRING(3,"String"){
        @Override
        public String getType() {
            return "this is String";
        }
    }
    ;
    int code;
    String value;
    TypeEnum(int code, String value){
        this.code=code;
        this.value=value;
    }

    public int getCode() {
        return code;
    }

    public   abstract String getType();

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static HashMap<String, TypeEnum> allValues=new HashMap<String, TypeEnum>(){
        {
            TypeEnum[] values= TypeEnum.values();
            for(int i=0;i<values.length;i++){
                this.put(values[i].value,values[i]);
            }
        }
    };

    public static TypeEnum getTypeEnumFromValue(String value){
        if(allValues.containsKey(value)) {
            return allValues.get(value);
        }
        return NULL;
    }
}
