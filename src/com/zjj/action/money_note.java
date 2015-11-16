package com.zjj.action;

import java.text.DecimalFormat;

/**
 * Created by zhaojj on 15/11/8.
 * money_note表所对应的实体类
 */
public class money_note {
    private int id;
    private String addtime;
    private String outputtime;
    private float amount;
    private String payType;
    private int isDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getOutputtime() {
        return outputtime;
    }

    public void setOutputtime(String outputtime) {
        this.outputtime = outputtime;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "money_note{" +
                "id=" + id +
                ", addtime='" + addtime + '\'' +
                ", outputtime='" + outputtime + '\'' +
                ", amount=" + amount +
                ", payType='" + payType + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}

