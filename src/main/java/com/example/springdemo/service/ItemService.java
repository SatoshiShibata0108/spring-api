package com.example.springdemo.service;

import com.example.springdemo.domain.Item;
import com.example.springdemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    /**
     * 商品一覧取得サービス
     * @return List<item>
     */
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    /**
     * 商品登録サービス
     * @param item
     * @return item
     */
    public Item create(Item item) {
        return itemRepository.save(item);
    }

    /**
     * 商品削除サービス
     * @param id
     */
    public void delete(Integer id) {
        itemRepository.deleteById(id);
    }

    /**
     * 商品更新サービス
     * @param item
     * @return item
     */
    public Item update(Item item) {
        return itemRepository.save(item);
    }
}
