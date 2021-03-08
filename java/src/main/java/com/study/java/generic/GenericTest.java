package com.study.java.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

//    public void test(List<String> strings){
//
//    }

    public void test(List<Integer> integers){

    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
//        list.add("hello");
//        list.add("world");
//        list.add(800);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println((String)list.get(i));
//        }

//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("hello");
//        list2.add("world");
//        list2.add(800);
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println((String)list2.get(i));
//        }
        ArrayList list3 = new ArrayList<String>();
        list3.add("hello");
        list3.add("world");
        list3.add(800);
        for (int i = 0; i < list3.size(); i++) {
            System.out.println((String)list3.get(i));
        }

        ImplGeneric<String> stringImplGeneric = new ImplGeneric<>();
        ImplGeneric<Integer> integerImplGeneric = new ImplGeneric<>();
        final Class stringImplGenericClass = stringImplGeneric.getClass();
        final Class integerImplGenericClass = integerImplGeneric.getClass();
        boolean equal = stringImplGenericClass == integerImplGenericClass;
        System.out.println(equal);
        System.out.println("string:"+stringImplGenericClass.getName()+"/"+"integer:"+integerImplGenericClass.getName());
//        ImplGeneric<String>[] genericStringArray=new ImplGeneric<String>[10];//编译不通过
//        ImplGeneric<String>[] genericStringArray2=new ImplGeneric[10];
    }

    public <T> T getZ(T t) {
        //泛型方法
        return null;
    }
}
