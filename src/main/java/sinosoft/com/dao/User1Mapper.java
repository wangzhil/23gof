package sinosoft.com.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import sinosoft.com.dto.User1;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.dao
 * @description
 * @date 2021/1/26 15:07
 * @Copyright © 2021-2022 sinosoft.com.cn
 */
public interface User1Mapper {

    /**
     * 插入
     * @param user
     */
    @Insert("insert into user (name) values (#{name});")
    void insert(@Param("name") String name);
}
