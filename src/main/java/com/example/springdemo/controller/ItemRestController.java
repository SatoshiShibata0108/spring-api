package com.example.springdemo.controller;

import com.example.springdemo.domain.Item;
import com.example.springdemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/items")
public class ItemRestController {
    @Autowired
    ItemService itemService;

    /**
     * 商品一覧取得API
     * @return List<item>
     */
    @CrossOrigin
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Item> getItems() {
        List<Item> customers = itemService.findAll();
        System.out.printf(String.valueOf(customers));
        return customers;
    }

    /**
     * 商品登録API
     * @param item
     * @return item
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Item postItem(@RequestBody Item item) {
        return itemService.create(item);
    }

    /**
     * 商品削除API
     * @param id
     */
    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteItem(@PathVariable Integer id) {
        itemService.delete(id);
    }

    /**
     * 商品更新API
     * @param id
     * @param item
     * @return item
     */
    @PutMapping(path = "{id}")
    Item putItem(@PathVariable Integer id, @RequestBody Item item) {
        item.setId(id);
        return itemService.update(item);
    }
}
