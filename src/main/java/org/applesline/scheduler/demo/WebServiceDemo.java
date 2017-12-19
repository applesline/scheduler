/**
 * 
 */
package org.applesline.scheduler.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 提供web服务的demo
 * 
 * @author liuyaping
 * 创建日期：2017年12月19日
 *
 */
@Controller
public class WebServiceDemo {

	@RequestMapping("/demo")
    @ResponseBody
    String test() {
        return "test-"+ this.getClass().getName();
    }
}
