package com.app.rinha.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Person {
    @JsonProperty("apelido")
    // required, unique, max 32 char
    private String nickname;

    @JsonProperty("nome")
    // required, max 100 char
    private String name;

    @JsonProperty("nascimento")
    // required, AAAA-MM-DD
    private Date birthDate;

    @JsonProperty("stack")
    // optional, max 32 char each
    private List<String> stack;
}
