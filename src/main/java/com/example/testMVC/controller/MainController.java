package com.example.testMVC.controller;

import com.example.testMVC.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    @GetMapping({"main", "/"})
    public String mainPage() {
        return "articles/main";
    }

    @GetMapping("/gugudan")
    public String guguDan() {
        return "/gugudan/gugu";
    }


    @GetMapping("/item")
    public String items(Model model) {
        List<Item> itemDtoList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            itemDtoList.add(new Item("테스트상품" + i, "상품상세설명", i * 1000, LocalDateTime.now()
            ));
        }
        model.addAttribute("item", itemDtoList);

        return "/articles/itemList";
    }
}
