/**
 * 
 */
package org.applesline.scheduler.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * 基于注解的定时任务配置的demo
 * 
 * @author liuyaping 创建日期：2017年12月13日
 *
 */
@Component
public class SchedulerServiceDemo {

	private static final Logger logger = LoggerFactory.getLogger(SchedulerServiceDemo.class);

	@Reference
	Demo demo;
	
	// 每5秒执行一次该任务
	@Scheduled(cron = "0/5 * * * * *")
	public void run() {
		logger.info("current time is :{}", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		logger.info(demo.hello());
	}
}
