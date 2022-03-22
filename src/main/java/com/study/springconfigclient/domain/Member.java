package com.study.springconfigclient.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private Long id;
    private String uid;
    private String name;
    private String password;
    private String number;
}
