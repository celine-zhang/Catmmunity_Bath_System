package com.xinlin.catbathsystem.catbathsystem.service;

import com.xinlin.catbathsystem.catbathsystem.entity.Cat;

import java.util.List;

public interface CatService {
    List<Cat> getAllCats();

    Cat saveCat(Cat cat);

    Cat getCatById(Long id);

    Cat updateCat(Cat cat);

    void deleteCatById(Long id);
}
