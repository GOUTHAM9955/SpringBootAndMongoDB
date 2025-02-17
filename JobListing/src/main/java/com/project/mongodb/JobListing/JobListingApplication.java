package com.project.mongodb.JobListing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
 * In this project we are trying to build a job listing spring boot application using
 *   	>> reach as font end
 *   	>> MongoDB as Database
 *      >> Swagger for API testing (Added two dependencies 1) SwaggerUi and Swagger2 from Maven Repository)
 */


@SpringBootApplication
@EnableSwagger2  // We enabled swagger with this annotation
public class JobListingApplication {
	
	// The below code is to enable swagger
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
				.build().apiInfo(apiInfo()).useDefaultResponseMessages(false);
	}
	@Bean
	public ApiInfo apiInfo() {
		final ApiInfoBuilder builder = new ApiInfoBuilder();
		return builder.build();
	}
	// Until here it's to enable swagger

	public static void main(String[] args) {
		SpringApplication.run(JobListingApplication.class, args);
	}

}
