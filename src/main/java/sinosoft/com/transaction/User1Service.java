package sinosoft.com.transaction;

import sinosoft.com.dto.User1;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.transaction.impl
 * @description
 * @date 2021/1/26 15:12
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
public interface User1Service {

    void addRequired(User1 user);

    void addRequiredNew(User1 user);

    void addNotSupported(User1 user);

    void addNoTransaction(User1 user);

    void addNested(User1 user);
}
