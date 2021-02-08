package sinosoft.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sinosoft.com.spring.InitIoc;
import sinosoft.com.spring.IocBeanFactory;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com
 * @description
 * @date 2021/1/26 16:37
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
@SpringBootApplication
public class Gof23SpringBootApplication {

    private InitIoc initIoc = (InitIoc) new IocBeanFactory().getInstance();

    public static void main(String[] args) {
        SpringApplication.run(Gof23SpringBootApplication.class, args);
    }
}
