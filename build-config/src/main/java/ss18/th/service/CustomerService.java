package ss18.th.service;

import ss18.th.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements IGenericService<Customer,Long> {
    public static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1L,"Nhung","nhung274@gmail.com.com","Ha Noi"));
        customerList.add(new Customer(2L,"Customer 1","kh2@gmail.com","Da Nang"));
        customerList.add(new Customer(3L,"Customer 2","kh3@gmail.com","Ho Chi Minh"));
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        return customerList.get(Math.toIntExact(id));
    }
}
