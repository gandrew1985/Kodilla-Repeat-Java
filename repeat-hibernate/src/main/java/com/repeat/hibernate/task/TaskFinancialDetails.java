package com.repeat.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "TASK_FINANCIALS")
public class TaskFinancialDetails {

    private int ID;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    public TaskFinancialDetails() {}

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    @NotNull
    public int getID() {
        return ID;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "PAID")
    public boolean isPaid() {
        return paid;
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }
}
