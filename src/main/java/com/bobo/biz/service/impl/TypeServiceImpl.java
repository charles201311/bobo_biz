package com.bobo.biz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bobo.biz.dao.TypeMapper;
import com.bobo.biz.domain.Type;
import com.bobo.biz.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {
	@Resource
	private TypeMapper typeMapper;

	@Override
	public boolean insertBatch(List<String> companys) {
		try {
			
			typeMapper.insertBatch(companys);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("导入失败!");
		}
	}

	@Override
	public List<Type> selects() {
		return typeMapper.selects();
	}

}
