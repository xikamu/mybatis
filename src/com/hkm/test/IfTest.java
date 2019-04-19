package com.hkm.test;

import com.hkm.mapper.CustmomerMapper;
import com.hkm.po.Customer;
import com.hkm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class IfTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        CustmomerMapper custmomerMapper=sqlSession.getMapper(CustmomerMapper.class);

        String keyword="曹";
        List<Customer> byLikeName =custmomerMapper.findAllByLikeName(keyword);

        for(Customer customer :byLikeName){
            System.out.println(customer);
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }
}