package com.example.testMVC.controller;

import com.example.testMVC.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class MainController {
    @GetMapping({"main","/"})
    public String mainPage() {
        return "main";
    }

    @GetMapping("/gugudan")
    public  String guguDan(){
        return "/gugudan/gugu";
    }


    @GetMapping("/item")
    public  String items(Model model){
        List<Item> itemDtoList = new ArrayList<>(
                Arrays.asList(
                        new Item("테스트상품1" ,"상품상세설명", 1000,"2023-01-01" )
                )
        );
        model.addAttribute("item", itemDtoList);
        return "/itemList";
    }
}
