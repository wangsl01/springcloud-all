package cloud.pay.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Paybill {
    private String billId;

    private String orderId;

    private String merchantId;

    private String goodsName;

    private BigDecimal orderAmount;

    private String orderRemark;

    private BigDecimal billAmount;

    private String billStatus;

    private String payerId;

    private String payerName;

    private String payerBank;

    private String payerAccount;

    private String payerRemark;

    private String receiverId;

    private String receiverName;

    private String receiverBank;

    private String receiverAccount;

    private String receiverRemark;

    private Date billTimeout;

    private Date billAutopayTime;

    private Date createTime;

    private Date payTime;

    private Date transferTime;

    private String cid;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId == null ? null : payerId.trim();
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    public String getPayerBank() {
        return payerBank;
    }

    public void setPayerBank(String payerBank) {
        this.payerBank = payerBank == null ? null : payerBank.trim();
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount == null ? null : payerAccount.trim();
    }

    public String getPayerRemark() {
        return payerRemark;
    }

    public void setPayerRemark(String payerRemark) {
        this.payerRemark = payerRemark == null ? null : payerRemark.trim();
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId == null ? null : receiverId.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverBank() {
        return receiverBank;
    }

    public void setReceiverBank(String receiverBank) {
        this.receiverBank = receiverBank == null ? null : receiverBank.trim();
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount == null ? null : receiverAccount.trim();
    }

    public String getReceiverRemark() {
        return receiverRemark;
    }

    public void setReceiverRemark(String receiverRemark) {
        this.receiverRemark = receiverRemark == null ? null : receiverRemark.trim();
    }

    public Date getBillTimeout() {
        return billTimeout;
    }

    public void setBillTimeout(Date billTimeout) {
        this.billTimeout = billTimeout;
    }

    public Date getBillAutopayTime() {
        return billAutopayTime;
    }

    public void setBillAutopayTime(Date billAutopayTime) {
        this.billAutopayTime = billAutopayTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }
}