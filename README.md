# spring-config-client 설정

## 1. spring cloud config server 의 config 읽어오기

1. application.yml 파일
    1. spring.application.name
    2. spring.profiles.active
    
> client 설정 파일의 위 정보를 읽어서 server 의 {spring.application.name}-{spring.profiles.active}.yml 파일을 읽어 들인다.


## 2. 동적으로 설정 값 변경하기

@RefreshScope annotation 의 유무에 따라 동적으로 설정 가능한 영역을 구분할 수 있다.