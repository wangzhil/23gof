package sinosoft.com.spring.aopdynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.spring.aopdynamic
 * @description
 * @date 2021/2/8 11:39
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
public class CglibProxy implements MethodInterceptor {

    private Object proxyObject;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGlib动态代理，监听开始！");
        Object result = method.invoke(proxyObject, objects);
        System.out.println("CGlib动态代理，监听结束！");
        return result;
    }

    private Object getCglibProxy(Object objectTarget) {
        this.proxyObject = objectTarget;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(objectTarget.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public static void main(String[] args) {
        CglibProxy cglib = new CglibProxy();
        AgentServiceImpl agentService = (AgentServiceImpl) cglib.getCglibProxy(new AgentServiceImpl());
        agentService.addAgent("小狗");
    }
}
