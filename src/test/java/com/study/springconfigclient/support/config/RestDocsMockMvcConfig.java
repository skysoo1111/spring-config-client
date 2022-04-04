package com.study.springconfigclient.support.config;

import org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;

@TestConfiguration
public class RestDocsMockMvcConfig {

  @Bean
  public RestDocsMockMvcConfigurationCustomizer restDocsMockMvcConfigurationCustomizer() {
    return configurer -> {
      configurer.operationPreprocessors()
                .withRequestDefaults(prettyPrint()) //요청 본문 문서화
                .withResponseDefaults(prettyPrint()); //응답 본문 문서화
    };
  }

}
