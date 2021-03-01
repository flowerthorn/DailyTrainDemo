package com.study.java.copy;

public class CopyTest {

    public static void main(String[] args) {
//        testShallowCopy();
        testDeepCopy();
    }

    private static void testDeepCopy() {
        //深拷贝
        StubObject stubObject = new StubObject(1);
        DeepCopy source = new DeepCopy("deep", 1, stubObject);
        DeepCopy deepCopy= (DeepCopy) source.clone();
        print(source, deepCopy);
        //改变原始数据的引用数据
        stubObject.setStubIntFiled(2);
        //改变原始数据的string数据
        source.setStringField("test2");
        //改变原始数据的int数据
        source.setIntField(2);
        print(source, deepCopy);
    }

    private static void testShallowCopy() {
        //浅拷贝
        StubObject stubObject = new StubObject(1);
        ShallowCopy source = new ShallowCopy("test", 1, stubObject);
        ShallowCopy copyObject = (ShallowCopy) source.clone();
        print(source, copyObject);
        //改变原始数据的引用数据
        stubObject.setStubIntFiled(2);
        //改变原始数据的string数据
        source.setStringField("test2");
        //改变原始数据的int数据
        source.setIntField(2);
        print(source, copyObject);
    }

    private static void print(SourceObject source, SourceObject copyObject) {
        System.out.println(
                "原数据：" + source.getStringField() + "/" + source.getIntField() + "/" + source
                        .getRefFiled().getStubIntFiled());
        System.out.println(
                "拷贝数据：" + copyObject.getStringField() + "/" + copyObject.getIntField() + "/"
                        + copyObject
                        .getRefFiled().getStubIntFiled());
    }
}
