package io.renren.modules.generator.service;

import io.renren.modules.generator.entity.PurchaseEntity;

import java.util.List;
import java.util.Map;

/**
 * 采购单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-11-23 16:55:39
 */
public interface PurchaseService {
	
	PurchaseEntity queryObject(Integer id);
	
	List<PurchaseEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PurchaseEntity purchase);
	
	void update(PurchaseEntity purchase);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
