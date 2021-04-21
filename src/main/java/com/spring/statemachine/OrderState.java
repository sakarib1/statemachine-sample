package com.spring.statemachine;

public enum OrderState {
    Open,
    ReadyForDelivery,
    AwaitingPayment,
    Completed,
    Canceled
}