package io.renren.modules.generator.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 采购单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-11-23 16:55:39
 */
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//采购项目
	private String itemlist;
	//采购总额
	private Float total;
	//申请时间
	private String applytime;
	//申请人
	private String applyer;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：采购项目
	 */
	public void setItemlist(String itemlist) {
		this.itemlist = itemlist;
	}
	/**
	 * 获取：采购项目
	 */
	public String getItemlist() {
		return itemlist;
	}
	/**
	 * 设置：采购总额
	 */
	public void setTotal(Float total) {
		this.total = total;
	}
	/**
	 * 获取：采购总额
	 */
	public Float getTotal() {
		return total;
	}
	/**
	 * 设置：申请时间
	 */
	public void setApplytime(String applytime) {
		this.applytime = applytime;
	}
	/**
	 * 获取：申请时间
	 */
	public String getApplytime() {
		return applytime;
	}
	/**
	 * 设置：申请人
	 */
	public void setApplyer(String applyer) {
		this.applyer = applyer;
	}
	/**
	 * 获取：申请人
	 */
	public String getApplyer() {
		return applyer;
	}
}
