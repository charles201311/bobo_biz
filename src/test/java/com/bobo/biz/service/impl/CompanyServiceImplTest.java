package com.bobo.biz.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.biz.domain.Company;
import com.bobo.biz.domain.Type;
import com.bobo.biz.service.CompanyService;
import com.bobo.biz.service.TypeService;
import com.bobo.common.utils.DateUtil;
import com.bobo.common.utils.RandomUtil;
import com.bobo.common.utils.StringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class CompanyServiceImplTest {

	@Resource
	private CompanyService companyService;
	@Resource
	private TypeService typeService;

	@Test
	public void testInsertBatch() {

		// 公司类型
		List<Type> list2 = typeService.selects();

		ArrayList<Company> list = new ArrayList<Company>();

		for (int i = 0; i < 100; i++) {

			Company c = new Company();
			String[] co = { "有限公司", "股份有限公司", "集团有限公司" };

			// (1)公司名称：以“北京”开头，以“有限公司”或“股份有限公司”或“集团有限公司”结尾，中间使用StringUtil.randomChineseString()方法创建2-4个随机汉字（4分）
			c.setName("北京" + StringUtil.randomChineseString(RandomUtil.random(2, 4)) + co[RandomUtil.random(0, 2)]);
			// (2)法人代表姓名：调用StringUtil.generateChineseName()创建（4分）
			c.setCorporation(StringUtil.generateChineseName());
			// (3)注册地址：以“北京市”开头，后面调用StringUtil.randomChineseString()创建20-40个汉字（4分）
			c.setAddress("北京市" + StringUtil.randomChineseString(RandomUtil.random(20, 40)));

			// 4注册资本：调用RandomUtil随机数工具方法生成，值在10万元-10亿元之间
			c.setCapital(RandomUtil.random(100000, 1000000000));
			// 5营业执照号：调用RandomUtil随机数工具方法生成，以1101开头，加上11位随机数，总共15位
			c.setRegistNo("1101" + RandomUtil.randomNumber(11));
			// 6(6)公司经济类型：调用RandomUtil随机数工具方法，在公司类型表中的所有id中随机抽（4分）。

			Type type = list2.get(RandomUtil.random(0, list2.size() - 1));
			c.setType(type);
			// (7)成立时间：模拟从1980年1月1日至今任意随机日期（4分）。
			Calendar calendar = Calendar.getInstance();
			calendar.set(1980, 0, 1);
			c.setCreated(DateUtil.randomDate(calendar.getTime(), new Date()));
			// 8(8)营业期限：在成立时间上延后50年（2分）。
			Calendar calendar2 = Calendar.getInstance();

			calendar2.setTime(c.getCreated());

			calendar2.add(Calendar.YEAR, 50);

			c.setPeriod(calendar2.getTime());
			list.add(c);
		}
		companyService.insertBatch(list);
	}

}
