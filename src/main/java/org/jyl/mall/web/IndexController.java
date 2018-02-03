package org.jyl.mall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 项目名称：mall-manager 类名称：IndexController 类描述： 商品首页入口controller 创建人：ocean
 * 创建时间：2018年1月28日 下午3:25:50
 * 
 * @version
 */
@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping({"index",""})
	public String index() {
		return "index";
	}

	@RequestMapping("{page}")
	public String page(@PathVariable("page") String page) {
		return page;
	}
}
