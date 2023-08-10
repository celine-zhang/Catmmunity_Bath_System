package com.xinlin.catbathsystem.catbathsystem.service.impl;

import com.xinlin.catbathsystem.catbathsystem.entity.Cat;
import com.xinlin.catbathsystem.catbathsystem.repository.CatRepository;
import com.xinlin.catbathsystem.catbathsystem.service.CatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    private CatRepository catRepository;

    public CatServiceImpl(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    @Override
    public Cat saveCat(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public Cat getCatById(Long id) {
        return catRepository.findById(id).get();
    }

    @Override
    public Cat updateCat(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public void deleteCatById(Long id) {
        catRepository.deleteById(id);
    }
}
