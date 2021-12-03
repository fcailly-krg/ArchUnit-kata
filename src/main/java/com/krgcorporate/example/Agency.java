package com.krgcorporate.example;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Agency {

    private final String id;

    private final String name;



}
