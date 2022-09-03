package com.newsapi.newsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "google-news")
public class NewsAPIController {

	@Autowired
	GoogleNewsService googleNewsService;
	
	@GetMapping(path = "{keyword}")
	public String getGoogleNews(@PathVariable String keyword) {
		return googleNewsService.getNews(keyword);
	}
	
}
