package com.scaler.bookmyshow.models;

import lombok.Getter;

import java.util.Date;
@Getter
public class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
