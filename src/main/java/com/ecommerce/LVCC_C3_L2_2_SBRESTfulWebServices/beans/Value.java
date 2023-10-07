package com.ecommerce.LVCC_C3_L2_2_SBRESTfulWebServices.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
	
    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

//    @Override
//    public String toString() {
//        return "Value{" +
//                "id=" + id +
//                ", quote='" + quote + '\'' +
//                '}';
//    }
    
    //To understand better
    @Override
    public String toString() {
        return "{ <br>" +
                "&nbsp&nbsp&nbsp&nbsp    idFetchedFromJSON=" + id + ",<br>" +
                "&nbsp&nbsp&nbsp&nbsp    quoteFetchedFromJSON='" + quote + "<br>" +
                '}';
    }


}
