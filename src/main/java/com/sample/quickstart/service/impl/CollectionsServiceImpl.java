package com.sample.quickstart.service.impl;

import com.sample.quickstart.service.CollectionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Slf4j
@Service
public class CollectionsServiceImpl implements CollectionsService {

    @Override
    public ArrayList<Integer> arrayList(){
        ArrayList<Integer> arr = new ArrayList(10);// we can give the index capcity if required
        arr.add(5);
        arr.add(10);
        System.out.println(arr);
        arr.add(0, 99);
        arr.set(1, 50); // changing the value of index no 1
        System.out.println(arr);
        System.out.println(arr.contains(10));// check whether the 10 value is available
        System.out.println(arr.get(2));// index no 2
        System.out.println(arr.indexOf(99)); // index value of 99
        System.out.println(arr);
        System.out.println(arr.size());//print the size of the array

        //print the array list
        for (int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }

        //print the array list 2 way
        for (Integer x:arr){
            System.out.println(x);
        }

        //print the array list 3 way
        arr.forEach(x -> System.out.println(x));

        return arr;

    }

    public LinkedList<Integer> linkedList(){

        LinkedList<Integer> linked =  new LinkedList<>(List.of(1,2,3));
        linked.add(10);

        System.out.println(linked);

        System.out.println(linked.indexOf(2));

        // lamda for one statement
        linked.forEach(n -> System.out.println(n*10));

        // lamda for several statements
        linked.forEach(n -> {
            System.out.println(n);
            System.out.println(n+1);
        });

        return linked;
    }


}
