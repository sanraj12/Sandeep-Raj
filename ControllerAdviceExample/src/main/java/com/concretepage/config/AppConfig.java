package com.concretepage.config;  
  
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
  
@Configuration 
@ComponentScan("com.concretepage") 
public class AppConfig {  
	@Bean  
    public UrlBasedViewResolver urlBasedViewResolver() {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/views/");  
        resolver.setSuffix(".jsp");
        resolver.setCache(false);
        
        return resolver;  
    }
}  
 