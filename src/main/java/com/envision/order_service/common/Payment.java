package com.envision.order_service.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int OrderId;
    private double amount;
}
