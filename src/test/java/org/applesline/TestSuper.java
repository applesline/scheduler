/**
 * 
 */
package org.applesline;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试用例基类
 * 
 * @author liuyaping 创建日期：2017年12月13日
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:spring/*.xml" })
public class TestSuper {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

}
