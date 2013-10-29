package com.model;

import java.math.BigDecimal;

public class Order
{
    private Long key;

    private BigDecimal value;

    private String initiatingUserId;

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getInitiatingUserId() {
        return initiatingUserId;
    }

    public void setInitiatingUserId(String initiatingUserId) {
        this.initiatingUserId = initiatingUserId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "key=" + key +
                ", value=" + value +
                ", initiatingUserId='" + initiatingUserId + '\'' +
                '}';
    }

}
