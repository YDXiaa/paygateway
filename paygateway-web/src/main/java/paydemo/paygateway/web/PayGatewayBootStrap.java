package paydemo.paygateway.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @auther YDXiaa
 * <p>
 * 程序启动类.
 */
@SpringBootApplication(scanBasePackages = "paydemo")
//@EnableTransactionManagement
@MapperScan(basePackages = "paydemo.paygateway.dao.mapper")
public class PayGatewayBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(PayGatewayBootStrap.class, args);
    }
}
