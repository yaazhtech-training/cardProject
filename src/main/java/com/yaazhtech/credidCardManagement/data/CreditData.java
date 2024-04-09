package com.yaazhtech.credidCardManagement.data;

import jakarta.persistence.*;


@Entity


@Table(name="Credit")

public class CreditData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Long id;
    private String cardHolderName;
    private String cardHolderPan;
    private String cardNumber;
    private String cardLimit;
    private String cardCvv;
    private Long cardPin;
    private String bankName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardHolderName() {

        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {

        this.cardHolderName = cardHolderName;
    }

    public String getCardHolderPan() {

        return cardHolderPan;
    }

    public void setCardHolderPan(String cardHolderPan) {

        this.cardHolderPan = cardHolderPan;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {

        this.cardNumber = cardNumber;
    }

    public String getCardLimit() {

        return cardLimit;
    }

    public void setCardLimit(String cardLimit) {

        this.cardLimit = cardLimit;
    }

    public String getCardCvv() {

        return cardCvv;
    }

    public void setCardCvv(String cardCvv) {

        this.cardCvv = cardCvv;
    }

    public long getCardPin() {

        return cardPin;
    }

    public void setCardPin(Long cardPin) {

        this.cardPin = cardPin;
    }

    public String getBankName() {

        return bankName;
    }

    public void setBankName(String bankName) {

        this.bankName = bankName;
    }
}
