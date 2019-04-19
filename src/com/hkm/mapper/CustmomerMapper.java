package com.hkm.mapper;

import com.hkm.po.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustmomerMapper {
    //ID查询
    Customer findById(int id);
    //查询全部
    List<Customer> findALL();
    //模糊查询
    List<Customer> findByLikeName(String keyword);
    //动态sql1
    List<Customer> findAllByLikeName(@Param("keyword") String keyword);
    //动态sql2
    List<Customer> findAllByLikeName2(@Param("keyword")String keyword,@Param("jobs")String jobs,@Param("id")int id);
}
