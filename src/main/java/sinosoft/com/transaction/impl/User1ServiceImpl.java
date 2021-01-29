package sinosoft.com.transaction.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sinosoft.com.dao.User1Mapper;
import sinosoft.com.dto.User1;
import sinosoft.com.dto.User2;
import sinosoft.com.transaction.User1Service;

import javax.annotation.Resource;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.transaction
 * @description
 * @date 2021/1/26 15:09
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
@Service
@Slf4j
public class User1ServiceImpl implements User1Service {

    @Resource
    private User1Mapper user1Mapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User1 user) {
        user1Mapper.insert(user.getName());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiredNew(User1 user) {
        user1Mapper.insert(user.getName());
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void addNotSupported(User1 user) {
        user1Mapper.insert(user.getName());
    }

    @Override
    public void addNoTransaction(User1 user) {
        user1Mapper.insert(user.getName());
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void addNested(User1 user) {
        user1Mapper.insert(user.getName());
    }


}
