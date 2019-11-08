package com.bobo.biz.dao;

import java.util.List;

import com.bobo.biz.domain.Type;

public interface TypeMapper {

	/**
	 * 
	 * @Title: insertBatch 
	 * @Description: 批量导入公司类型
	 * @param companys
	 * @return
	 * @return: int
	 */
	int insertBatch(List<String> companys);
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询所有的企业类型
	 * @return
	 * @return: List<Type>
	 */
	List<Type> selects();
}
