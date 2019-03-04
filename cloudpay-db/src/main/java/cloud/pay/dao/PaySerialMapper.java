package cloud.pay.dao;

import cloud.pay.domain.PaySerial;

public interface PaySerialMapper {
    int deleteByPrimaryKey(String serialId);

    int insert(PaySerial record);

    int insertSelective(PaySerial record);

    PaySerial selectByPrimaryKey(String serialId);

    int updateByPrimaryKeySelective(PaySerial record);

    int updateByPrimaryKey(PaySerial record);
}