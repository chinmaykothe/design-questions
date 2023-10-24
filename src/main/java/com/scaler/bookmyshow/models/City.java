package com.scaler.bookmyshow.models;

import java.util.ArrayList;
import java.util.List;

public class City extends BaseModel {
    private String name;
    private List<Theatre> theatre = new ArrayList<>();
}
