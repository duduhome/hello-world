package com.zjj.action;

import java.text.DecimalFormat;

/**
 * Created by zhaojj on 15/11/8.
 * money_note表所对应的实体类
 */
public class money_note {
    private int id;
    private String addtime;
    private String paytime;
    private String content;
    private float amount;
    private int payType;
    private int isDelete;
    private String begintime;
    private String endtime;

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

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

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
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
                ", paytime='" + paytime + '\'' +
                ", content='" + content + '\'' +
                ", amount=" + amount +
                ", payType=" + payType +
                ", isDelete=" + isDelete +
                '}';
    }
}

