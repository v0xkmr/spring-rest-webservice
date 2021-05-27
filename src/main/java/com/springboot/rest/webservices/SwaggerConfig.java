package com.springboot.rest.webservices;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	//access the swagger ui @ - http://localhost:8080/swagger-ui/
	//access the api docs @ - http://localhost:8080/v3/api-docs
}
