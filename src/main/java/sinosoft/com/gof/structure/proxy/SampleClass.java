package sinosoft.com.gof.structure.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.gof.structure.proxy
 * @description
 * @date 2021/1/20 16:06
 * @Copyright © 2020-2021 sinosoft.com.cn
 */
public class SampleClass {

    void test() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before method run .....");
                Object result = methodProxy.invokeSuper(o, objects);
                System.out.println("after method run ....");
                return result;
            }
        });
        SampleClass sampleClass = (SampleClass) enhancer.create();
        sampleClass.test();
    }
}
