package cn.sm1234.mapper;

import cn.sm1234.domain.Customer;

/**
 * @author 张强
 * created on 2018/12/29  19:17:05
 * description
 */
public interface CustomerMapper {
    public void save_mapper(Customer customer);

    public Customer getCustomerById(Long id);
}
