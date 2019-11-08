package com.bobo.biz.service;

import java.util.List;

import com.bobo.biz.domain.Company;

public interface CompanyService {

	/**
	 * 批量插入公司
	 * @Title: insertBatch 
	 * @Description: TODO
	 * @param commpanys
	 * @return
	 * @return: int
	 */
	boolean insertBatch(List<Company> commpanys);

}
