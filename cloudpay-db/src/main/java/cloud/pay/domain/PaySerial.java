package cloud.pay.domain;

import java.util.Date;

public class PaySerial {
    private String serialId;

    private String serialType;

    private String serialStatus;

    private String serialBank;

    private String bankErrCode;

    private String bankErrMsg;

    private Date createTime;

    private Date modifyTime;

    private String orderId;

    private String parentBillId;

    private String billId;

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getSerialType() {
        return serialType;
    }

    public void setSerialType(String serialType) {
        this.serialType = serialType == null ? null : serialType.trim();
    }

    public String getSerialStatus() {
        return serialStatus;
    }

    public void setSerialStatus(String serialStatus) {
        this.serialStatus = serialStatus == null ? null : serialStatus.trim();
    }

    public String getSerialBank() {
        return serialBank;
    }

    public void setSerialBank(String serialBank) {
        this.serialBank = serialBank == null ? null : serialBank.trim();
    }

    public String getBankErrCode() {
        return bankErrCode;
    }

    public void setBankErrCode(String bankErrCode) {
        this.bankErrCode = bankErrCode == null ? null : bankErrCode.trim();
    }

    public String getBankErrMsg() {
        return bankErrMsg;
    }

    public void setBankErrMsg(String bankErrMsg) {
        this.bankErrMsg = bankErrMsg == null ? null : bankErrMsg.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getParentBillId() {
        return parentBillId;
    }

    public void setParentBillId(String parentBillId) {
        this.parentBillId = parentBillId == null ? null : parentBillId.trim();
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }
}