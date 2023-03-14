package com.javacore.iodemo;

import java.io.*;

public class ObjectOutputDemo {
    static class Dog implements Serializable{

        private int age;
        private String name;
        private String kind;

        public Dog(int age, String name, String kind) {
            this.age = age;
            this.name = name;
            this.kind = kind;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", kind='" + kind + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Dog dog = new Dog(4,"wangcai","拉布拉多");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\dog"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\dog"));

        oos.writeObject(dog);
        Object o = ois.readObject();
        System.out.println((Dog)o);

        oos.close();
        ois.close();
    }
}
