package com.kod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Michal on 2017-07-11.
 */
@RestController
public class rescikclass {

    @Autowired
    private UserDao userDao;

    @GetMapping("/")
    public String index() {
        return "1YYYY!!!";
    }

    @GetMapping("/dupa")
    public String index2() {
        return "jiiiiii!!!";
    }

    @GetMapping("/create")
    public String create() {
        String imeie = "Janek";
        String email = "Kowalski@gmail.com";
        User uesr = new User(imeie, email);
        userDao.create(uesr);
        return "TAK!!!";
    }
}
