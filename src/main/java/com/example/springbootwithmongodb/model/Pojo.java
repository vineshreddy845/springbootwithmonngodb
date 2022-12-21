package com.example.springbootwithmongodb.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "reddy")
public class Pojo {

    private String name;
    private String last;
    private int number[];
    private int age;
}
