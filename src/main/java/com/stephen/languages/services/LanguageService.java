package com.stephen.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stephen.languages.models.Language;
import com.stephen.languages.repositories.LanguageRepo;

@Service
public class LanguageService {
	private final LanguageRepo languageRepo;
	
	public LanguageService(LanguageRepo languageRepo) {
		this.languageRepo = languageRepo;
	}
	
	public List<Language> allLanguages(){
		return languageRepo.findAll();
	}
	
	public Language createLanguage(Language language) {
		return languageRepo.save(language);
	}
	
	public Language updateLanguage(Language language) {
		return languageRepo.save(language);
	}
	
	public void deleteLanguage(Language language) {
		languageRepo.delete(language);
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLang = languageRepo.findById(id);
		if(optionalLang.isPresent()) {
			return optionalLang.get();
		}else {
			return null;
		}
	}
}
