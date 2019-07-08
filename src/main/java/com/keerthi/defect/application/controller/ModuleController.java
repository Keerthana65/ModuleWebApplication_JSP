package com.keerthi.defect.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.keerthi.defect.application.entities.Module;
import com.keerthi.defect.application.services.ModuleService;

@Controller
public class ModuleController {
	
	@Autowired
	ModuleService service;
	

	//Add Records
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createModule";
	}
	
	@RequestMapping("/saveMod")
	public String saveModule(@ModelAttribute("module")Module module, ModelMap modelMap ) {
		Module saveModules = service.saveModule(module);
		String msg = "Module save with id" + saveModules.getModuleid();
		modelMap.addAttribute("msg", msg);
		 return "createModule";
	}
	
	//View All Records
	@RequestMapping("/displayModule")
	public String displayModule(ModelMap modelMap) {
//		List<Module> Modules = service.getAllModules();
//		modelMap.addAttribute("Modules",Modules);
		List<Module> modules = service.getAllModules();
		modelMap.addAttribute("Modules",modules);
		return "displayModule";
	}
	
	//Delete Records
	@RequestMapping("/deleteModule")
	public String deleteModule(@RequestParam("moduleid") int moduleid,ModelMap modelMap) {
		//Module module = service.getModuleById(moduleid);
		Module module = new Module();
		module.setModuleid(moduleid);
		service.deleteModule(module);
		List<Module> modules = service.getAllModules();
		modelMap.addAttribute("Modules",modules);
		return "displayModule";
	}
	
	//show update method
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("moduleid") int moduleid,ModelMap modelMap ) {
		Module module =service.getModuleById(moduleid);
		modelMap.addAttribute("module", module);
		return "updateModule";
	}
	
	//update records
	@RequestMapping("/updateMod")
	public String updateModule(@ModelAttribute("module")Module module, ModelMap modelMap) {
		service.updateModule(module);
		List<Module> modules = service.getAllModules();
		modelMap.addAttribute("modules ", modules);
		return "displayModule";
	}
}
