package com.example.imperialapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialApiController {

    ImperialApi imperialApi = new ImperialApi();

    @RequestMapping("/api/centimeter")
    public double centimeter(@RequestParam double inch){
        return imperialApi.centimeter(inch);
    }

    @RequestMapping("/api/meter")
    public double meter(@RequestParam double yard){
        return imperialApi.meter(yard);
    }
}




