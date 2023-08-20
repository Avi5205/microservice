package com.springboot.microservices.limitsservice.bean;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Limits {

    private int minimum;
    private int maximum;

}
