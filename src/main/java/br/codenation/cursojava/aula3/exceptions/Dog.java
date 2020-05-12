package br.codenation.cursojava.aula3.exceptions;

import java.security.InvalidParameterException;

public class Dog {

    private String name;

    private String breed;

    private int age;

    private double weigth;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed) {
        this(name);
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws DogException {
        if (name != null && name.trim().length() > 40) {
            throw new DogInvalidNameException();
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed != null && breed.trim().length() > 30) {
            throw new InvalidParameterException();
        }
        this.breed = breed;
    }

    public String getAge() {
        return String.valueOf(age);
    }

    public void setAge(int idade) {
        if (age < 0) {
            throw new InvalidParameterException();
        }
        this.age = age;
    }

    public String getWeigth() {
        return String.valueOf(weigth);
    }

    public void setWeigth(double weigth) {
        if (weigth < 0) {
            throw new InvalidParameterException();
        }
        this.weigth = weigth;
    }

}
