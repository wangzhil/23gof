package sinosoft.com.gof.structure.proxy.third;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.gof.structure.proxy.third
 * @description
 * @date 2021/1/19 18:03
 * @Copyright © 2020-2021 sinosoft.com.cn
 */
@Slf4j
public class ProxyTestBImpl implements ProxyTestInterface {
    @Override
    public void demandAnalysis() {
        log.info("demandAnalysis .. B");
    }

    @Override
    public void demandDesign() {
        log.info("demandDesign .. B");
    }

    @Override
    public void development() {
        log.info("development .. B");
    }

    @Override
    public void selfTest() {
        log.info("selfTest .. B");
    }
}
