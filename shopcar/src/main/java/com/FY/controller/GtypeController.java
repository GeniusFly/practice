package com.FY.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.FY.entity.Gtype;
import com.FY.service.GtypeService;

@Controller
@RequestMapping("/gtype")
public class GtypeController {
	@Autowired // 好像是把在Impl里面创建的service注进来
	private GtypeService gtypeService;

	// 传统方式

	// 换个简单点的方式实现修改，不显示原来的数据，直接加

	// gtype/typeid/${gtype.typeid }/update.html
	/*
	 * @RequestMapping("typeid/{typeid}/update.html") public String
	 * update(@PathVariable("typeid") int typeid) { System.out.println(typeid);
	 * return "gtype/TypeUpdate"; }
	 */

	@RequestMapping("/typeadd.html")
	public String typeadd() {
		return "gtype/TypeAdd";
	}

	@RequestMapping("/delete.html")
	public String update(int typeid) {
		gtypeService.deleteGtype(typeid);
		return "redirect:/gtype/list.html";
	}

	@RequestMapping("/update.html")
	public String update() {
		return "gtype/TypeUpdate";
	}

	@RequestMapping("/list.html")
	public String list(ModelMap map) {
		List<Gtype> list = gtypeService.getGtypeList();
		map.put("list", list);
		return "gtype/TypeManage";

	}

	// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷路锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟铰凤拷锟�
	/*
	 * @RequestMapping(value="/typeadd",method=RequestMethod.POST) public
	 * ModelAndView typeadd(Gtype gtype) { ModelAndView mv = new ModelAndView();
	 * gtypeService.addGtype(gtype); mv.setViewName("gtype/TypeManage");
	 * mv.addObject("gtype", gtype); return mv; }
	 */

	@RequestMapping(value = "/typeadd", method = RequestMethod.POST)
	public String typeadd(Gtype gtype, ModelMap map) {
		gtypeService.addGtype(gtype);
		return "redirect:/gtype/list.html";
	}

	@RequestMapping(value = "/typeupdate", method = RequestMethod.POST)
	public String typeupdate(Gtype gtype, ModelMap map) {
		gtypeService.updateGtype(gtype);
		return "redirect:/gtype/list.html";
	}

}
