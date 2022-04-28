package com.manna.JameswayEmployee.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Builder
@Data
@ToString
public class Employee {
    private int id;
    private String name;

}
