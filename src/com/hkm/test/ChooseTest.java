package com.hkm.test;

import com.hkm.mapper.CustmomerMapper;
import com.hkm.po.Customer;
import com.hkm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ChooseTest {

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        CustmomerMapper custmomerMapper=sqlSession.getMapper(CustmomerMapper.class);
        String keyword="孙";
        String jobs ="程序猿";
        int id=10;
        List<Customer> byLikeName =custmomerMapper.findAllByLikeName2(keyword,jobs,id);

        for(Customer customer :byLikeName){
            System.out.println(customer);
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }
}
