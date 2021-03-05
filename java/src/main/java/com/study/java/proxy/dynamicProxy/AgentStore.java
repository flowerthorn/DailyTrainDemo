package com.study.java.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentStore {

    Object mObject;

    public AgentStore(Object object) {
        mObject = object;
    }

    public <T> T create(final Class<T> agent) {
        return (T) Proxy.newProxyInstance(agent.getClassLoader(), new Class<?>[]{agent},
                /**
                 *这个函数是反射函数，method具体代表的是代理在执行的当前函数
                 */
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects)
                            throws Throwable {
                        Object result = method.invoke(mObject, objects);
                        return result;
                    }
                });
    }
}
