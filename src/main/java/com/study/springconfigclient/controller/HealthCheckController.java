package com.study.springconfigclient.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/healthcheck")
@RestController
public class HealthCheckController {
    @GetMapping("/_check/{name}")
    public ResponseEntity getString(@PathVariable String name) {
        return ResponseEntity.ok().body(new HealthCheckDTO(name) );
    }

    @Data
    @AllArgsConstructor
    private class HealthCheckDTO {
        private String status;
    }
}
