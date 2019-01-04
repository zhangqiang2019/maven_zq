import cn.sm1234.domain.Customer;
import cn.sm1234.mapper.CustomerMapper;
import cn.sm1234.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author 张强
 * created on 2018/12/29  20:01:39
 * description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerMapperTest {
    //依赖注入
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private CustomerService customerService;

    @Test
    public void testSave(){
    Customer customer = new Customer();
        customer.setName("张强");
        customer.setGender("男");
        customer.setAge(25);

        customerMapper.save_mapper(customer);

    }

    @Test
    public void testGetCustomerById(){
        Customer customer = customerService.getCustomerById(3L);
        System.out.println(customer.getName());
    }

}
