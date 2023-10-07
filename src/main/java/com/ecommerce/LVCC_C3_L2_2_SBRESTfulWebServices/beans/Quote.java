package com.ecommerce.LVCC_C3_L2_2_SBRESTfulWebServices.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
    private String type;
    private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

//    @Override
//    public String toString() {
//        return "Quote{" +
//                "type='" + type + '\'' +
//                ", value=" + value +
//                '}';
//    }
    
    //To Understand Better
    @Override
    public String toString() {
        return "Quote{<br>" +
                "&nbsp&nbsp  typeFetchedFromJSON='" + type + "',<br>" +
                "&nbsp&nbsp  valueFetchedFromJSON=" + value +  "<br>" +
                '}';
    }


}
