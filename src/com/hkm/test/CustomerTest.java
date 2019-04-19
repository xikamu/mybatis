package com.hkm.test;

import com.hkm.mapper.CustmomerMapper;
import com.hkm.po.Customer;
import com.hkm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class CustomerTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        CustmomerMapper custmomerMapper=sqlSession.getMapper(CustmomerMapper.class);
        Customer customer = custmomerMapper.findById(1);
        System.out.println(customer);

    }
}
