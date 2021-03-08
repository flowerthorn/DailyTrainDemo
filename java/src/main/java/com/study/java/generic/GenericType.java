package com.study.java.generic;

public class GenericType<T> {

    private T mData;

    public T getData() {
        return mData;
    }

    public void setData(T data) {
        mData = data;
    }
    public static void main(String[] args) {
        GenericType<String> genericType = new GenericType<>();
        genericType.setData("hello world");
        System.out.println(genericType.getData());
        GenericType<Fruit> fruitGenericType = new GenericType<>();
        GenericType<Apple> appleGenericType = new GenericType<>();
        GenericType<Food> foodGenericType = new GenericType<>();
//        print(appleGenericType);//不可以，因为没有继承关系
        print2(appleGenericType);//可以 因为 ? extends Fruit  限定Fruit的子类都可以
//        print2(foodGenericType);//不可以 food是fruit的父类
        print3(foodGenericType);//可以 ? super Fruit 限定Fruit的父类都可以
    }

    public static void print(GenericType<Fruit> type) {
    }

    public static void print2(GenericType<? extends Fruit> type) {
    }

    public static void print3(GenericType<? super Fruit> type) {
    }

    //泛型方法定义
    public <T> void test(T t) {
    }

}
