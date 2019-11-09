package com.bobo.biz.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bobo.biz.domain.Company;
import com.bobo.biz.service.CompanyService;
import com.bobo.biz.util.PageUtil;
import com.bobo.biz.vo.CompanyVO;
import com.github.pagehelper.PageInfo;

@Controller
public class CompanyController {
	@Resource
	private CompanyService companyService;

	@RequestMapping("selects")
	public String selects(HttpServletRequest request, CompanyVO vo, @RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "20") Integer pageSize) {
		PageInfo<Company> info = companyService.selects(vo, page, pageSize);
		PageUtil.page(request, "/selects", pageSize, info.getList(), (int) info.getTotal(), page);

		request.setAttribute("companys", info.getList());

		// request.setAttribute(name, o);

		return "companys";
	}

}
