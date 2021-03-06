package com.bobo.biz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bobo.biz.dao.CompanyMapper;
import com.bobo.biz.domain.Company;
import com.bobo.biz.service.CompanyService;
import com.bobo.biz.vo.CompanyVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/*
 * 
 */
@Service
public class CompanyServiceImpl implements CompanyService {
	@Resource
	private CompanyMapper companyMapper;

	@Override
	public boolean insertBatch(List<Company> commpanys) {
		try {
			companyMapper.insertBatch(commpanys);
			return true;
		} catch (Exception e) {

			throw new RuntimeException("插入失败");
		}
	}

	@Override
	public PageInfo<Company> selects(CompanyVO vo,Integer page,Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Company> list = companyMapper.selects(vo);
		return new PageInfo<Company>(list);
	}

}
