package io.renren.modules.generator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.modules.generator.dao.PurchaseDao;
import io.renren.modules.generator.entity.PurchaseEntity;
import io.renren.modules.generator.service.PurchaseService;



@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseDao purchaseDao;
	
	@Override
	public PurchaseEntity queryObject(Integer id){
		return purchaseDao.queryObject(id);
	}
	
	@Override
	public List<PurchaseEntity> queryList(Map<String, Object> map){
		return purchaseDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return purchaseDao.queryTotal(map);
	}
	
	@Override
	public void save(PurchaseEntity purchase){
		purchaseDao.save(purchase);
	}
	
	@Override
	public void update(PurchaseEntity purchase){
		purchaseDao.update(purchase);
	}
	
	@Override
	public void delete(Integer id){
		purchaseDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		purchaseDao.deleteBatch(ids);
	}
	
}
