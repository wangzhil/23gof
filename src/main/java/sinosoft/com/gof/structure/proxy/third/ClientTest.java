package sinosoft.com.gof.structure.proxy.third;

import java.lang.reflect.Proxy;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.gof.structure.proxy.third
 * @description
 * @date 2021/1/19 14:35
 * @Copyright © 2020-2021 sinosoft.com.cn
 */
public class ClientTest {

    public static void main(String[] args) {

        TestProxyHandler testProxyHandler = new TestProxyHandler(new ProxyTestBImpl());
        ProxyTestInterface proxyTestInterface = (ProxyTestInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                ProxyTestBImpl.class.getInterfaces(),
                testProxyHandler);

        proxyTestInterface.demandAnalysis();
        proxyTestInterface.demandDesign();
        proxyTestInterface.development();
        proxyTestInterface.selfTest();
    }
}
