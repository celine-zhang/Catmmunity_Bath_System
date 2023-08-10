package com.xinlin.catbathsystem.catbathsystem.repository;

import com.xinlin.catbathsystem.catbathsystem.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
