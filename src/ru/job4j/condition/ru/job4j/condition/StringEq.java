package ru.job4j.condition.ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String first = new String("one");
        System.out.println(first.hashCode()); //=110182
        System.out.println(first); //=one

        String one = new String("one");
        System.out.println(one.hashCode()); //=110182
        System.out.println(new String("one")); //=one

        if (first == one) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equal one");
        }
    }
}
