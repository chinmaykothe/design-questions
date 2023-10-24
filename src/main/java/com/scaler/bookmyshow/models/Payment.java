package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.enums.PaymentStatus;

public class Payment extends  BaseModel {
    private String reference;
    private Double amount;
    private PaymentStatus status;
}
