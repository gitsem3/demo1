package com.example.demo.entity;

import lombok.*;
import org.springframework.util.StringUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class Product {
    private int id; // 01
    private String name; //
    private String slug; //
    private String thumbnail;
    private String description;
    private int status;
    
}
