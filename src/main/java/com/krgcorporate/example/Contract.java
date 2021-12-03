package com.krgcorporate.example;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

@Data
@Document
public class Contract {

    @Id
    @Nullable
    private String id;

    @Nullable
    private String ref;

    @Nullable
    private String externalRef;

}
