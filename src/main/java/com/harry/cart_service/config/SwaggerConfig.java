package com.harry.cart_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.harry.cart_service"))
//                .paths(PathSelectors.ant("/cart/*"))
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfo(
//                "JavaWithHarry REST API",
//                "This is Car service API.",
//                "API 1.0",
//                "Terms of service",
//                new Contact("Harry", "www.javawithharry.com", "java.with.harry@gmail.com"),
//                "License of API", "API license URL", Collections.emptyList());
//    }

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().build();
    }

    private Predicate<String> postPaths() {
        return or(regex("/cart-service/*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("JavaWithHarry API")
                .description("CartService API reference for developer")
                .termsOfServiceUrl("http://javawithharry.com")
                .contact("javawithharry@gmail.com").license("JavaWithHarry License")
                .licenseUrl("javawithharry@gmail.com").version("1.0").build();
    }

}
