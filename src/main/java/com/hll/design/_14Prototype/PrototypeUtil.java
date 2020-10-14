package com.hll.design._14Prototype;

import java.io.*;

/**
 * @author linglong.he
 * @date 2020-09-04 10:40
 **/
public class PrototypeUtil<E> {


    public E deepCopy(E e) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(e);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        E o = (E) objectInputStream.readObject();
        return o;
    }

}
