package sinosoft.com.transaction;

import sinosoft.com.dto.User1;
import sinosoft.com.dto.User2;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.transaction
 * @description
 * @date 2021/1/26 15:12
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
public interface User2Service{

    void addRequired(User2 user);

    void addRequiredException(User2 user);

    void addRequiredNew(User2 user);

    void addRequiredNewException(User2 user);

    void addNotSupported(User2 user);

    void addNotSupportedException(User2 user);

    void addNoTransaction(User2 user);

    void addaddNested(User2 user);

    void addaddNestedException(User2 user);
}
