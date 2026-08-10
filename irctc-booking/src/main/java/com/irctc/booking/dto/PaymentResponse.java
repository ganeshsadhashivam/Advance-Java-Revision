package com.irctc.booking.dto;






import com.irctc.booking.enums.PaymentStatus;

public class PaymentResponse {

    private String transactionId;

    private PaymentStatus paymentStatus;

    private String message;

    public PaymentResponse() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
