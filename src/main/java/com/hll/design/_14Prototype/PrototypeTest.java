package com.hll.design._14Prototype;

import java.io.IOException;
import java.io.Serializable;

/**
 * @author linglong.he
 * @date 2020-09-04 10:12
 **/
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Location location = new Location("深圳龙岗","13211138890");
//        Person person = new Person("hll",18,location);
//        Person person1 = (Person)person.clone();
        Person1 person = new Person1("hll",18,location);
        Person1 person1 = new PrototypeUtil<Person1>().deepCopy(person);

        System.out.println(person1);
        System.out.println(person.getLocation() == person1.getLocation());
    }

}

class Person1 implements Serializable{
    private String name;
    private int age;
    private Location location;

    public Person1(String name, int age, Location location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + location +
                '}';
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}


class Person implements Cloneable{
    private String name;
    private int age;
    private Location location;

    public Person(String name, int age, Location location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + location +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();
//        p.location = (Location) location.clone();
        return p;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

class Location implements Cloneable,Serializable{
    private String address;
    private String phone;

    public Location(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Location(String phone) {
        this.phone = phone;
    }
}
