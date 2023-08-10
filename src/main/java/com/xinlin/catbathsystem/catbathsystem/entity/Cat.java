package com.xinlin.catbathsystem.catbathsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cats")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "cat_name", nullable = false)
    private String name;
    @Column(name = "cat_breed")
    private String breed;
    @Column(name = "email", nullable = false)
    private String email;

    public Cat() {
    }

    public Cat(String name, String breed, String email) {
        this.name = name;
        this.breed = breed;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
