package sinosoft.com.spring.aopdynamic;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.spring.aopdynamic
 * @description
 * @date 2021/2/8 11:35
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
public class AgentServiceImpl {

    public String addAgent(String name) {
        System.out.println("新增代理人：" + name);
        return name;
    }
}
