package com.cursoSpring.api_market.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {

    private int categoryId;
    private String category;
    private boolean active;

}
