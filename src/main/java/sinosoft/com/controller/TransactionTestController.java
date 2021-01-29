package sinosoft.com.controller;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sinosoft.com.dto.User1;
import sinosoft.com.dto.User2;
import sinosoft.com.transaction.User1Service;
import sinosoft.com.transaction.User2Service;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author wangzhilei
 * @version V1.0
 * @Package sinosoft.com.controller
 * @description
 * @date 2021/1/26 16:31
 * @Copyright © 2021-2022 sinosoft.com.cn
 */

@RestController
public class TransactionTestController {
    @Resource
    private User1Service user1Service;
    @Resource
    private User2Service user2Service;

    @GetMapping("/test1")
    public void notransaction_exception_required_required() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequired(user2);

        throw new RuntimeException("aaaaa");
    }


    @GetMapping("/test2")
    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_exception_required_required() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequired(user2);

        throw new RuntimeException("aaaaa");
    }

    @GetMapping("/test3")
    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_required_required_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiredException(user2);

    }

    @GetMapping("/test4")
    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_required_required_exception_try() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");

        try {
            user2Service.addRequiredException(user2);
        } catch (Exception e) {
            System.out.println("方法回滚");
        }
    }



    @GetMapping("/requiresNew1")
    @Transactional(propagation = Propagation.REQUIRED)
    public void notransaction_exception_requiresNew_requiresNew() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequiredNew(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiredNew(user2);

        User2 user3=new User2();
        user3.setName("王五");
        user2Service.addRequiredNew(user3);

        throw new RuntimeException();
    }

    @GetMapping("/requiresNew2")
    @Transactional(propagation = Propagation.REQUIRED)
    public void notransaction_requiresNew_requiresNew_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequiredNew(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiredNewException(user2);

    }

    @GetMapping("/requiresNew3")
    @Transactional(propagation = Propagation.REQUIRED)
    public void notransaction_requiresNew_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequiredNew(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        try {
            user2Service.addRequiredNewException(user2);
        } catch (Exception e) {
            System.out.println("33333333");
        }

    }


    @GetMapping("/notsupported1")
    @Transactional(propagation = Propagation.REQUIRED)
    public void notSupported_request() throws InterruptedException {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNotSupported(user2);
        System.out.println("等待5秒开始!!!!!!");
        TimeUnit.SECONDS.sleep(5);
        throw new RuntimeException("bbbbb");
    }

    @GetMapping("/supports")
    @Transactional(propagation = Propagation.REQUIRED)
    public void supports_request() throws InterruptedException {

        dealSupports();
        TimeUnit.SECONDS.sleep(5);

    }


    @GetMapping("/nested1")
    @Transactional(propagation = Propagation.REQUIRED)
    public void nested_required() throws InterruptedException {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNested(user1);
        System.out.println("等待5秒开始!!!!!!");
        TimeUnit.SECONDS.sleep(5);


        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addaddNested(user2);
        System.out.println("等待5秒开始!!!!!!");

        TimeUnit.SECONDS.sleep(5);
        throw new RuntimeException("bbbbb");
    }


    @GetMapping("/nested2")
    @Transactional(propagation = Propagation.REQUIRED)
    public void nested_required_Exception() throws InterruptedException {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNoTransaction(user1);
        System.out.println("等待5秒开始!!!!!!");
        TimeUnit.SECONDS.sleep(5);


        User2 user2 = new User2();
        user2.setName("李四");
        try {
            user2Service.addaddNestedException(user2);
        } catch (Exception e) {
            System.out.println("1111111111111");
        }

        System.out.println("等待5秒开始!!!!!!");

    }


    @Transactional(propagation = Propagation.SUPPORTS)
    void dealSupports() throws InterruptedException {

        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNoTransaction(user1);

        System.out.println("等待5秒开始!!!!!!");
        TimeUnit.SECONDS.sleep(5);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNoTransaction(user2);
        System.out.println("等待5秒开始!!!!!!");

        TimeUnit.SECONDS.sleep(5);
    }


    @GetMapping("/demo1")
    @Transactional(propagation = Propagation.REQUIRED)
    void demo() throws InterruptedException {

        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNoTransaction(user1);

        try {
            dealDemo();
        } catch (Exception e) {
            System.out.println("11111");
        }

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNoTransaction(user2);
        System.out.println("等待5秒开始!!!!!!");

        TimeUnit.SECONDS.sleep(5);
    }


    void dealDemo() {

        User2 user2 = new User2();
        user2.setName("王五");
        user2Service.addRequiredNewException(user2);

    }

}
