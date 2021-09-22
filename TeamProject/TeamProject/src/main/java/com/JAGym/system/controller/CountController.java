package com.JAGym.system.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.JAGym.system.dao.CenterChartCountDao;
import com.JAGym.system.dao.MemberChartCountDao;
import com.JAGym.system.dto.CenterChartDto;
import com.JAGym.system.dto.MemberChartDto;



@RestController
@RequestMapping("/system/")
public class CountController {
	
	@Autowired
	private MemberChartCountDao memberchartcountdao;
	@Autowired
	private CenterChartCountDao centerchartcountdao;
	
	@RequestMapping("chart")
	public ModelAndView Chart(ModelAndView mav){
		
		List<MemberChartDto> memberChart = memberchartcountdao.getMemberCount();
		 mav.addObject("memberChart", memberChart);
		
		List<CenterChartDto> centerChart = centerchartcountdao.getCenterCount();
		 mav.addObject("centerChart", centerChart);
		 
		 mav.setViewName("chart");
		
		return mav;
	}
	
	
	
	
	

}
