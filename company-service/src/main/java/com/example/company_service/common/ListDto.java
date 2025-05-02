package com.example.company_service.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListDto<T> {
    private List<T> list;

    public ListDto(List<T> list) {
        this.list = list;
    }

}
