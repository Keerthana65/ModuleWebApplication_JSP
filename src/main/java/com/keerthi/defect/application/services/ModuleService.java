package com.keerthi.defect.application.services;

import java.util.List;

import com.keerthi.defect.application.entities.Module;

public interface ModuleService {

	Module saveModule(Module module);
	Module updateModule(Module module);
	void deleteModule(Module module);
	Module getModuleById(int moduleid);
	List<Module> getAllModules();
	
	
}
