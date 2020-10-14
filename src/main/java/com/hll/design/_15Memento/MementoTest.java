package com.hll.design._15Memento;

import java.io.*;

/**
 * @author linglong.he
 * @date 2020-09-04 10:22
 **/
public class MementoTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person("hll",18);
        File f = new File("d://p.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f));
        objectOutputStream.writeObject(p);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f));
        Person person = (Person)objectInputStream.readObject();
        System.out.println(person.getName());
    }


}

class Person implements Serializable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
