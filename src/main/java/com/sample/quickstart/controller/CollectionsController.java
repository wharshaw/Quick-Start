package com.sample.quickstart.controller;

import com.sample.quickstart.service.CollectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequestMapping("api/collections")
@RestController
public class CollectionsController {

    @Autowired
    CollectionsService collectionsService;

    @PostMapping("/arraylist")
    public ArrayList<Integer> arrayList(){
        return collectionsService.arrayList();
    }

    @PostMapping("/contains")
    public boolean contains(){
        ArrayList<Integer> arr = collectionsService.arrayList();
        return arr.contains(10);
    }

}
