package cn.sm1234.service;

import cn.sm1234.domain.Customer;

/**
 * @author 张强
 * created on 2019/1/2  19:23:12
 * description
 */
public interface CustomerService {
    public void save(Customer customer);
    public Customer getCustomerById(Long id);
}
