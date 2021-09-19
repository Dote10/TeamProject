package com.JAGym.system.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.JAGym.system.dao.MemberSysCountDao;
import com.JAGym.system.dto.MemberChartDto;



@RestController
@RequestMapping("/system/")
public class CountController {
	
	@Autowired
	private MemberSysCountDao membersyscountdao;
	
	@RequestMapping("chart")
	public ModelAndView memberChart(ModelAndView mav){
		
		List<MemberChartDto> memberChart = membersyscountdao.getMemberCount();
		 mav.addObject("memberChart", memberChart);
		 mav.setViewName("chart");
		
		return mav;
	}
	
	

}
