package com.study.springconfigclient.controller;//package com.tving.manager.controller;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import springfox.documentation.annotations.ApiIgnore;
//
//@Api(tags = {"1. Health"})
//@ApiIgnore
//@RequestMapping("/healthcheck")
//@RestController
//public class HealthCheckController {
//    @ApiOperation(value = "TEST RESPONSE", notes = "RESPONSE 를 테스트한다.")
//    @GetMapping("/_check")
//    public ResponseEntity getString() {
//        return ResponseEntity.ok().body(new HealthCheckDTO("ok") );
//    }
//
//    @Data
//    @AllArgsConstructor
//    private class HealthCheckDTO {
//        private String status;
//    }
//}
