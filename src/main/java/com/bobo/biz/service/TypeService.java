package com.bobo.biz.service;

import java.util.List;

import com.bobo.biz.domain.Type;

public interface TypeService {
	/**
	 * 
	 * @Title: insertBatch 
	 * @Description: 批量导入公司类型
	 * @param companys
	 * @return
	 * @return: int
	 */
	boolean insertBatch(List<String> companys);
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询所有的企业类型
	 * @return
	 * @return: List<Type>
	 */
	List<Type> selects();
}
