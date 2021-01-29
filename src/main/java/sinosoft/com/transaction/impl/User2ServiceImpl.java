package sinosoft.com.transaction.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sinosoft.com.dao.User2Mapper;
import sinosoft.com.dto.User1;
import sinosoft.com.dto.User2;
import sinosoft.com.transaction.User2Service;

import javax.annotation.Resource;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.transaction
 * @description
 * @date 2021/1/26 15:10
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
@Service
public class User2ServiceImpl implements User2Service {

    @Resource
    private User2Mapper user2Mapper;

    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User2 user) {
        user2Mapper.insert(user.getName());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequiredException(User2 user) {
        user2Mapper.insert(user.getName());
        throw new RuntimeException();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiredNew(User2 user) {
        user2Mapper.insert(user.getName());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiredNewException(User2 user) {
        user2Mapper.insert(user.getName());
        throw new RuntimeException();
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void addNotSupported(User2 user) {
        user2Mapper.insert(user.getName());
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void addNotSupportedException(User2 user) {
        user2Mapper.insert(user.getName());
        throw new RuntimeException();
    }

    @Override
    public void addNoTransaction(User2 user) {
        user2Mapper.insert(user.getName());
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void addaddNested(User2 user) {
        user2Mapper.insert(user.getName());
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void addaddNestedException(User2 user) {
        user2Mapper.insert(user.getName());
        throw new RuntimeException();
    }
}
