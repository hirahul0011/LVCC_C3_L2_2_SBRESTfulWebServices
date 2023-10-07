package com.ecommerce.LVCC_C3_L2_2_SBRESTfulWebServices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.LVCC_C3_L2_2_SBRESTfulWebServices.beans.Quote;
import com.ecommerce.LVCC_C3_L2_2_SBRESTfulWebServices.beans.Value;

@Controller
public class MainController {
	
    @RequestMapping("/")
    @ResponseBody
    public String index() {
           
       RestTemplate restTemplate = new RestTemplate();
//       Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
       
       Quote quote = restTemplate.getForObject("https://gistcdn.githack.com/ayan-b/"+
    		   	"ff0441b5a8d6c489b58659ffb849aff4/raw/"+
    		   "e1c5ca10f7bea57edd793c4189ea8339de534b45/response.json", Quote.class);
       //Output 
       //Quote{type='success', value=Value{id=10, quote='Really loving Spring Boot, makes stand alone Spring apps easy.'}}

//       Value quote = restTemplate.getForObject("https://gistcdn.githack.com/ayan-b/"+
//   		   	"ff0441b5a8d6c489b58659ffb849aff4/raw/"+
//   		   "e1c5ca10f7bea57edd793c4189ea8339de534b45/response.json", Value.class);
       //Output 
       //Value{id=null, quote='null'}
          
      return quote.toString();
    }

}
