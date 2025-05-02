package com.example.company_service.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class CompanyDto {
    private long id;
    private String name;
    private Double budget;
    private List<Long> employeeIds;
}
