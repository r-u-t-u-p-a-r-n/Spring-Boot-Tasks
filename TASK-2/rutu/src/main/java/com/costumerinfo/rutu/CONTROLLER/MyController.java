package com.costumerinfo.rutu.CONTROLLER;
import com.costumerinfo.rutu.CustomerInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController
{
    @GetMapping("/customerinfo/{Name}/{Gender}/{Age}")
    public CustomerInfo getInfo(@PathVariable("Name") String Name,
                                @PathVariable("Gender") String Gender,
                                @PathVariable("Age") int Age)
    {
        return new CustomerInfo(Name,Gender,Age);
    }
}
