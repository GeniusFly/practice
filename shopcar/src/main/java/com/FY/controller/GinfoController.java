package com.FY.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.FY.entity.Ginfo;
import com.FY.entity.Gtype;
import com.FY.service.GinfoService;

@Controller
@RequestMapping("/ginfo")
public class GinfoController {
	@Autowired // 好像是把在Impl里面创建的service注进来
	private GinfoService ginfoService;

	@RequestMapping("/infoadd.html")
	public String infoadd() {
		return "ginfo/InfoAdd";
	}

	@RequestMapping("/delete.html")
	public String update(int id) {
		ginfoService.deleteGinfo(id);
		return "redirect:/ginfo/list.html";
	}

	@RequestMapping("/update.html")
	public String update() {
		return "ginfo/InfoUpdate";
	}

	@RequestMapping("/list.html")
	public String list(ModelMap map) {
		List<Ginfo> list = ginfoService.getGinfoList();
		map.put("list", list);
		return "ginfo/InfoManage";

	}

	// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷路锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟铰凤拷锟�
	/*
	 * @RequestMapping(value="/typeadd",method=RequestMethod.POST) public
	 * ModelAndView typeadd(Gtype gtype) { ModelAndView mv = new ModelAndView();
	 * gtypeService.addGtype(gtype); mv.setViewName("gtype/TypeManage");
	 * mv.addObject("gtype", gtype); return mv; }
	 */

	@RequestMapping(value = "/infoadd", method = RequestMethod.POST)
	public String typeadd(Ginfo ginfo, ModelMap map) {
		ginfoService.addGinfo(ginfo);
		return "redirect:/ginfo/list.html";
	}
	
	@RequestMapping(value = "/infoupdate", method = RequestMethod.POST)
	public String tinfoupdate(Ginfo ginfo, ModelMap map) {
		ginfoService.updateGinfo(ginfo);
		return "redirect:/ginfo/list.html";
	}

}
