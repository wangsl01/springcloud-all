package cloud.pay.dao;

import cloud.pay.domain.Paybill;

public interface PaybillMapper {
    int deleteByPrimaryKey(String billId);

    int insert(Paybill record);

    int insertSelective(Paybill record);

    Paybill selectByPrimaryKey(String billId);

    int updateByPrimaryKeySelective(Paybill record);

    int updateByPrimaryKey(Paybill record);
}