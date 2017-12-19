/**
 * 
 */
package org.applesline.scheduler;

import org.applesline.TestSuper;
import org.applesline.scheduler.demo.Demo;
import org.junit.Test;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * 测试用例demo
 * 
 * @author liuyaping
 * 创建日期：2017年12月19日
 *
 */
public class DemoServiceTest extends TestSuper {

	@Reference
	Demo demo;
	
	@Test
	public void test() {
		logger.info("返回值：{}",demo.hello());
	}
}
