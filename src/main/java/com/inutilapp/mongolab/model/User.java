package com.inutilapp.mongolab.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String cod;
    private String firstName;
    private String lastName;
    private boolean enabled;

    public User(String cod, String firstName, String lastName) {
        this.cod = cod;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = true;
    }

}
