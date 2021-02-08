package sinosoft.com.spring;

import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.util.Properties;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.spring
 * @description
 * @date 2021/2/8 10:13
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
public class IocBeanFactory {

    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(IocBeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object getInstance() {
        String initIoc = properties.getProperty("initIoc");
        System.out.println(initIoc);
        try {
            Class<?> aClass = Class.forName(initIoc);
            Object o = aClass.newInstance();
            System.out.println(o.toString());
            return o;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
