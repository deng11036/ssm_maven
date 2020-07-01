package com.itcast.service.impl;

import com.itcast.dao.ItemsDao;

import com.itcast.domain.Items;
import com.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        System.out.println("jdsaajasj");
        return itemsDao.findById(id);
    }
}