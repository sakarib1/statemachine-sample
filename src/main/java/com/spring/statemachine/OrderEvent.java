package com.spring.statemachine;

public enum OrderEvent {
    UnlockDelivery,
    ReceivePayment,
    Refund,
    Deliver,
    Reopen,
    Cancel
}