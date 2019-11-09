package com.bobo.biz.dao;

import java.util.List;

import com.bobo.biz.domain.Company;
import com.bobo.biz.vo.CompanyVO;

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
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 列表模糊查询
	 * @param vo
	 * @return
	 * @return: List<Company>
	 */
	List<Company> selects(CompanyVO vo);

}
