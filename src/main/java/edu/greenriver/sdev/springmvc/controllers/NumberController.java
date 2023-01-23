package edu.greenriver.sdev.springmvc.controllers;

import edu.greenriver.sdev.springmvc.services.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author zahra madhar
 * @version 17.01
 */

@Controller
public class NumberController
{

    private NumberService service;

    /**
     * @param service
     */
    public NumberController(NumberService service){
        this.service = service;
    }

    @Override
    public String toString() {
        return "NumberController{" +
                "service=" + service +
                '}';
    }

    @RequestMapping("/randnum")
    public String genNumber(Model modelVars){

        modelVars.addAttribute("num",service.between(1,20));
        return "randnum";
    }
    @RequestMapping("/powerball")
    public String powerNumbers(Model power){

       power.addAttribute("num0",service.between(1,69));
        power.addAttribute("num1",service.between(1,69));
        power.addAttribute("num2",service.between(1,69));
        power.addAttribute("num3",service.between(1,69));
        power.addAttribute("num4",service.between(1,69));
        power.addAttribute("num5",service.between(1,20));
        return "powerball";
    }

}
