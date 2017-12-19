/**
 * 
 */
package org.applesline.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 项目的启动类
 * 
 * @author liuyaping
 * 创建日期：2017年12月19日
 *
 */
@SpringBootApplication
@ImportResource(value = { "classpath:spring/spring-bean.xml","classpath:spring/spring-database.xml"  })
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
	
}
