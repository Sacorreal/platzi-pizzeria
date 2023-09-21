package com.platzi.pizza.persistence.entity;

public class OrderItemId {
    private Integer idOrder;
    private Integer idItem;
    @Override
    public boolean equals(object o){
        if (this == o) return true;
    }
}
