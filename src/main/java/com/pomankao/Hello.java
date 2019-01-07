package com.pomankao;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person person = new Person();
        person.hello();
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        String name = "Poman";
        Integer age2 = 19;
        System.out.println("age2's byte is " + age2.byteValue());
    }
}
