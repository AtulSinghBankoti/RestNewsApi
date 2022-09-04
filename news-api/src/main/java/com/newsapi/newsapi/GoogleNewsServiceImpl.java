package com.newsapi.newsapi;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoogleNewsServiceImpl implements GoogleNewsService{

	public static final String URL ="https://newsapi.org/v2/everything?"; 
	public static final String KEY ="API-KEY"; 
	
	@Override
	public String getNews(String newsKey) {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> res = restTemplate.getForEntity(URL+"q="+newsKey+"&apiKey="+KEY, String.class);	
		return  res.getBody();
	}
	
	

}
