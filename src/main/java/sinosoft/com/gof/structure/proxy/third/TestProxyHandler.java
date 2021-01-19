package sinosoft.com.gof.structure.proxy.third;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.gof.structure.proxy.third
 * @description
 * @date 2021/1/19 14:25
 * @Copyright © 2020-2021 sinosoft.com.cn
 */
@Slf4j
public class TestProxyHandler implements InvocationHandler {

    private ProxyTestInterface proxyTestInterface = null;
    private static final String METHOD_1 = "demandAnalysis";
    private static final String METHOD_2 = "demandDesign";

    public TestProxyHandler(ProxyTestInterface proxyTestInterface) {
        this.proxyTestInterface = proxyTestInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object object = null;
        if (METHOD_1.equals(method.getName())) {
            log.info("统一处理..demandAnalysis  ");
        } else if(METHOD_2.equals(method.getName())) {
            log.info("统一处理..demandDesign  ");
        } else {
            object = method.invoke(proxyTestInterface, args);
        }

        return object;
    }
}
