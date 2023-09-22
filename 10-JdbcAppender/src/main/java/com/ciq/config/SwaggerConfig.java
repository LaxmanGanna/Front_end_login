package com.ciq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	 @Bean
	    Docket newsApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .groupName("spring boot microservice")
	                .apiInfo(apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.ciq.controller"))
	                .paths(PathSelectors.any())
	                .build();
	    }


	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("Spring Boot microservice API")
	                .description("Spring boot API reference for developers")
	                .version("1.0")
	                .build();
	    }

}
