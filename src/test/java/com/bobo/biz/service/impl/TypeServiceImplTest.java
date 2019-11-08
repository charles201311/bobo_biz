package com.bobo.biz.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.biz.service.TypeService;
import com.bobo.common.utils.StreamUtil;
/**
 * 启动 spring容器
 * @ClassName: TypeServiceImplTest 
 * @Description: TODO
 * @author: charles
 * @date: 2019年11月8日 上午10:51:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class TypeServiceImplTest {
	
	@Resource
	private TypeService typeService;

	@Test
	public void testInsertBatch() throws FileNotFoundException {
		//调用工具类.读取源文件
		String txt = StreamUtil.readTextFile(new File("E:/company.txt"));
		String[] split = txt.split("\\|");
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(split));
		
	//	System.out.println(list);
		
		
		boolean b = typeService.insertBatch(list);
		System.out.println(b);
		
	}

}
