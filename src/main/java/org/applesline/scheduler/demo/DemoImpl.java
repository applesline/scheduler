/**
 * 
 */
package org.applesline.scheduler.demo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 暴露dubbo服务的demo
 * 
 * @author liuyaping
 * 创建日期：2017年12月19日
 *
 */
@Component
@Service
public class DemoImpl implements Demo {

	@Override
	public String hello() {
		return "############################ say hello to the world ! ############################";
	}
	
}
