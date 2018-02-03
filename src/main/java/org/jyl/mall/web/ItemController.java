package org.jyl.mall.web;

import java.util.List;

import org.jyl.mall.entity.Item;
import org.jyl.mall.service.ItemService;
import org.jyl.mall.vo.DataGridVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
 /**   
*    
* 项目名称：mall-manager   
* 类名称：ItemController   
* 类描述：   
* 创建人：ocean   
* 创建时间：2018年1月28日 下午5:57:44   
* @version        
*/
@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemSerive;
	
	@RequestMapping("/list")
	@ResponseBody
	public DataGridVO<Item> selectItemAll(@RequestParam(value="page",defaultValue="1")int pageNum, @RequestParam(value="rows",defaultValue="10")int pageSize){
		//使用pageHelper进行分页
		PageHelper.startPage(pageNum, pageSize);
		//获取数据
		List<Item> itemList = itemSerive.selectAllItem();
		//分装数据
		PageInfo<Item> info = new PageInfo<Item>(itemList);
		DataGridVO<Item> result = new DataGridVO<Item>();
		result.setRows(info.getList());
		result.setTotal(info.getTotal());
		return result;
	}
}
