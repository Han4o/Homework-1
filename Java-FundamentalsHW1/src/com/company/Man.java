package com.company;

public class Man extends Car {
   private String name;

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    private int age;
   private int height = 180;
    public void set_man(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void walk() {
        System.out.printf("%s walks\n", name);
    }
    public void eat() {
        System.out.printf("%s eats\n", name);
    }
    //Task 6
    public String toString(){
        return "Man " + name + " " + age;
    }


}
