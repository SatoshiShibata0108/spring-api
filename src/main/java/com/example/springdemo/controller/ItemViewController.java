package com.example.springdemo.controller;

import com.example.springdemo.domain.Item;
import com.example.springdemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ItemViewController {
    @Autowired
    ItemService itemService;

    /**
     * Hello World
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String SayHello(Model model) {
        model.addAttribute("msg", "test Check!!!");
        return "hello";
    }

    /**
     * 商品情報表示
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/itemView", method = RequestMethod.GET)
    public String itemView(Model model) {
        List<Item> itemList =  itemService.findAll();

        model.addAttribute("list", itemList);
        return "item_view";
    }

}
