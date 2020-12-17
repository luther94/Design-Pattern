package structuralPatterns.proxyPattern.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class Agent  {

    public Star getProxy() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SingStar.class);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            String methodName = method.getName();
            if ("sing".equals(methodName)) {
                System.out.println("演唱会20万一场");
                Object invoke = proxy.invokeSuper(obj, args);
                System.out.println("演唱会完毕");
                return invoke;
            }
            if ("dance".equals(methodName)) {
                System.out.println("跳舞请求不接");
            }
            return null;
        });

        return (Star) enhancer.create();
    }
}
