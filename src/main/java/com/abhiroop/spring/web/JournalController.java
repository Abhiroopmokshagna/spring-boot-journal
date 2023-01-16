package com.abhiroop.spring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhiroop.spring.domain.Journal;
import com.abhiroop.spring.repository.JournalRepository;

@Controller
@RequestMapping("/")
public class JournalController {
	@Autowired
	JournalRepository repo;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("journal", repo.findAll());
		return "index";
	}
	
	@GetMapping("/journal")
    public @ResponseBody List<Journal> getJournal() {
        return repo.findAll();
    }
}
