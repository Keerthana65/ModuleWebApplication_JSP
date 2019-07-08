package com.keerthi.defect.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.keerthi.defect.application.entities.Module;
import com.keerthi.defect.application.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleRepository repository;
	
	@Override
	public Module saveModule(Module module) {
		return repository.save(module);
	}

	@Override
	public Module updateModule(Module module) {
		return repository.save(module);
	}

	@Override
	public void deleteModule(Module module) {
		repository.delete(module);

	}

//	@Override
//	public Module getModuleById(int moduleid) {
//		return repository.findOne(moduleid);
//	}

	@Override
	public List<Module> getAllModules() {
		return repository.findAll();
	}

	public ModuleRepository getRepository() {
		return repository;
	}

	public void setRepository(ModuleRepository repository) {
		this.repository = repository;
	}

	@Override
	public Module getModuleById(int moduleid) {
		
		return null;
	}

}
