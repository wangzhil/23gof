package sinosoft.com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.spring
 * @description
 * @date 2021/2/7 8:20
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new A());
    }
}

@Service
class A {
    @Resource
    private B b;
}

@Service
class B {
    @Resource
    private A a;


}
