package com.cursoSpring.api_market.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class PurchaseItem {

    private int productId;
    private int quantity;
    private double total;
    private boolean active;

}
