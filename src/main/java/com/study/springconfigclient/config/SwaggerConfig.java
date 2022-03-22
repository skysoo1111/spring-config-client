package com.study.springconfigclient.config;//package com.tving.manager.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.HashSet;
//import java.util.Set;
//
////@EnableWebMvc
//@EnableSwagger2
//@Configuration
//public class SwaggerConfig extends WebMvcConfigurationSupport {
//    @Bean
//    public Docket swaggerApi() {
//        return new Docket(DocumentationType.OAS_30)
//                .useDefaultResponseMessages(false)
//                .consumes(getConsumeContentTypes())
//                .produces(getProduceContentType())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.tving.manager.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(swaggerInfo());
//    }
//
//    private ApiInfo swaggerInfo() {
//        return new ApiInfoBuilder()
//                .title("Practice Swagger")
//                .description("practice swagger config")
//                .version("1.0")
//                .build();
//    }
//
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/swagger-ui/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
//
//    }
//
//    private Set<String> getConsumeContentTypes() {
//        Set<String> consumes = new HashSet<>();
//        consumes.add("application/json;charset=UTF-8");
//        consumes.add("application/x-www-form-urlencoded");
//        return consumes;
//    }
//
//    private Set<String> getProduceContentType() {
//        Set<String> produces = new HashSet<>();
//        produces.add("application/json;charset=UTF-8");
//        return produces;
//    }
//}
