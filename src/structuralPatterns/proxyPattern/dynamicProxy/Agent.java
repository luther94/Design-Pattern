package structuralPatterns.proxyPattern.dynamicProxy;

import java.lang.reflect.Proxy;

public class Agent  {
    private SingStar singStar;

    public Agent() {
        singStar = new SingStar();
    }

    public Star getProxy() {
        return (Star) Proxy.newProxyInstance(Star.class.getClassLoader(), new Class[]{Star.class},
                (proxy, method, args) -> {
                    String methodName = method.getName();
                    if ("sing".equals(methodName)) {
                        System.out.println("演唱会20万一场");
                        Object invoke = method.invoke(singStar, args);
                        System.out.println("演唱会完毕");
                        return invoke;
                    }

                    if ("dance".equals(methodName)) {
                        System.out.println("跳舞请求不接");
                    }

                    return null;
                });
    }
}
