package com.bobo.biz.service;

import java.util.List;

import com.bobo.biz.domain.Company;
import com.bobo.biz.vo.CompanyVO;
import com.github.pagehelper.PageInfo;

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
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 列表模糊查询
	 * @param vo
	 * @return
	 * @return: List<Company>
	 */
	PageInfo<Company> selects(CompanyVO vo,Integer page,Integer pageSize );


}
