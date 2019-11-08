package com.bobo.biz.dao;

import java.util.List;

import com.bobo.biz.domain.Company;

public interface CompanyMapper {
	/**
	 * 批量插入公司
	 * @Title: insertBatch 
	 * @Description: TODO
	 * @param commpanys
	 * @return
	 * @return: int
	 */
	int insertBatch(List<Company> commpanys);

}
