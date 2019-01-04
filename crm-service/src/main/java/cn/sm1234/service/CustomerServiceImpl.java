package cn.sm1234.service;

import cn.sm1234.domain.Customer;
import cn.sm1234.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;

/**
 * @author 张强
 * created on 2019/1/2  21:14:43
 * description
 */
//Transactional是事务注解

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;


    public void save(Customer customer) {
        customerMapper.save_mapper(customer);

    }

    public Customer getCustomerById(Long id){
        return customerMapper.getCustomerById(id);
    }
}
