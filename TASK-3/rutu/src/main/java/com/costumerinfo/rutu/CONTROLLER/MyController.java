package com.costumerinfo.rutu.CONTROLLER;
import com.costumerinfo.rutu.CustomerInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController
{
    @GetMapping("/customerinfo")
    public CustomerInfo getInfo(@RequestParam("Name") String Name,
                                @RequestParam("Gender") String Gender,
                                @RequestParam("Age") int Age)
    {
        return new CustomerInfo(Name,Gender,Age);
    }
}
