# spring-config-client 설정

## 0. Tech Spec
|항목|내용|
|---|---|
|Java|JDK 11|
|Framework|SpringBoot 2.6.4|
|Build Tool|Gradle 7.4.1|
|Database|MySQL 8.0.28|
|ORM|JPA, Mybatis 3.5.6|
|API Docs|Rest Docs|

## 1. spring cloud config server 의 config 읽어오기

1. application.yml 파일
    1. spring.application.name
    2. spring.profiles.active
    
> client 설정 파일의 위 정보를 읽어서 server 의 {spring.application.name}-{spring.profiles.active}.yml 파일을 읽어 들인다.


## 2. 동적으로 설정 값 변경하기

@RefreshScope annotation 의 유무에 따라 동적으로 설정 가능한 영역을 구분할 수 있다.