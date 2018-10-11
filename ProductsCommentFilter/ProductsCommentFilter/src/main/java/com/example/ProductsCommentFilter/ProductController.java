package com.example.ProductsCommentFilter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

public class ProductController {

	@Autowired
	Product product;
	
	@RequestMapping(value="/product/{comment}/{id}", method=RequestMethod.POST)
	public void userComments(@PathVariable("comment") String comment,@PathVariable("id") int id) {
		product.setId(id);
		product.setComment(comment);
		
		RestTemplate restTemplate = new RestTemplate();
		String url
		  = "http://localhost:8080//comment/validation/content";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url + comment, String.class);											
			
		
			
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/comment/validation/{String}")
	  
	  public   @ResponseBody String getCommentAndValidate(@PathVariable("content") String content) {
		
		if(true )
		{
			return "fasle";
		}
		
		
	  return "true";
	}
	

	
}