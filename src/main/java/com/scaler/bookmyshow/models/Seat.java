package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.enums.SeatType;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Seat extends BaseModel {
    private Integer rowNo;
    private Integer columnNo;
    private SeatType seatType;
}
