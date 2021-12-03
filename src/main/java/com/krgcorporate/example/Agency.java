package com.krgcorporate.example;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

@Data
@Document
public class Agency {

    @Id
    @Nullable
    private final String id;

    @Nullable
    private final String name;

}
