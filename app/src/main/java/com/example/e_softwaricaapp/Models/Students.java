package com.example.e_softwaricaapp.Models;

public class Students {
    private String name;
    private int age;
    private String gender;
    private String address;
    private int image;

    public Students(String name, int age, String gender, String address, int image) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
