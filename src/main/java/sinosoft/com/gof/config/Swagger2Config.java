/**
 * @Copyright 2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年8月8日
 * 修改历史 : 
 *     1. [2017年8月8日]创建文件 by guobao
 */
package sinosoft.com.gof.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration注解　加载此类配置
 * EnableSwagger2注解　启用Swagger2
 */
@Configuration
@EnableSwagger2
@ComponentScan
public class Swagger2Config {
	@Value("${usp.enable.swagger}")
	private boolean enableSwagger;
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).enable(enableSwagger) //创建API基本信息
                .groupName("") //指定分组，对应(/v2/api-docs?group=)
                .pathMapping("") //base地址，最终会拼接Controller中的地址
                .select() //控制要暴露的接口
                .apis(RequestHandlerSelectors.basePackage("sinosoft.com.gof")) //通过指定扫描包暴露接口
                .paths(PathSelectors.any()) //设置过滤规则暴露接口
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("gof23测试界面").description("新契约服务").termsOfServiceUrl("")
                .contact(new Contact("guobao", "http://guobao.cn/", "mail@mail.com")).version("1.0").license("").licenseUrl("").build();
    }
}
