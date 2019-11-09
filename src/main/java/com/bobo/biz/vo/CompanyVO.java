package com.bobo.biz.vo;

import com.bobo.biz.domain.Company;

public class CompanyVO extends Company {
	
	private Integer p1;//起始注册资金
	private Integer p2;//结束注册资金
	private String ctype;//公司类型

	private String[] qt;//其他
	
	
	public String[] getQt() {
		return qt;
	}
	public void setQt(String[] qt) {
		this.qt = qt;
	}
	public Integer getP1() {
		return p1;
	}
	public void setP1(Integer p1) {
		this.p1 = p1;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	

}
