package com.JwtSecurity.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String id;
    private String name;
    private String email;
}
