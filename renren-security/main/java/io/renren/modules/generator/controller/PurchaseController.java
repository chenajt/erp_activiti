package io.renren.modules.generator.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.PurchaseEntity;
import io.renren.modules.generator.service.PurchaseService;
import io.renren.modules.generator.utils.PageUtils;
import io.renren.modules.generator.utils.Query;
import io.renren.modules.generator.utils.R;


/**
 * 采购单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-11-23 16:55:39
 */
@RestController
@RequestMapping("purchase")
public class PurchaseController {
	@Autowired
	private PurchaseService purchaseService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("purchase:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<PurchaseEntity> purchaseList = purchaseService.queryList(query);
		int total = purchaseService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(purchaseList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("purchase:info")
	public R info(@PathVariable("id") Integer id){
		PurchaseEntity purchase = purchaseService.queryObject(id);
		
		return R.ok().put("purchase", purchase);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("purchase:save")
	public R save(@RequestBody PurchaseEntity purchase){
		purchaseService.save(purchase);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("purchase:update")
	public R update(@RequestBody PurchaseEntity purchase){
		purchaseService.update(purchase);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("purchase:delete")
	public R delete(@RequestBody Integer[] ids){
		purchaseService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
