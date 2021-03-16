package com.study.train.inject;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

public class InjectUtils {

    public static void injectView(Activity activity) {
        final Class<? extends Activity> aClass = activity.getClass();
        //反射
//        aClass.getFields();// 自己+父类的成员
//        aClass.getDeclaredFields();//获取自己的类成员，不包括父类
//        aClass.getMethods();
        final Field[] declaredFields = aClass.getDeclaredFields();
        for (final Field declaredField : declaredFields) {
            //判断属性是否被注解标记
            if (declaredField.isAnnotationPresent(InjectView.class)) {
                //获取注解
                final InjectView annotation = declaredField.getAnnotation(InjectView.class);
                //获取注解中设置的id
                final int id = annotation.value();
                View view = activity.findViewById(id);
                //反射设置 属性的值
                declaredField.setAccessible(true);
                try {
                    declaredField.set(activity, view);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
