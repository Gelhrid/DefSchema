package com.kod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Michal on 2017-07-11.
 */
@RestController
public class rescikclass {
    @GetMapping("/")
    public String index(){
        return "1YYYY!!!";
    }

    @GetMapping("/dupa")
    public String index2(){
        return "jiiiiii!!!";
    }
}
