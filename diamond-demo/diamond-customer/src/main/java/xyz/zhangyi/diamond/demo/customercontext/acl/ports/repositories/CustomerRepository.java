package xyz.zhangyi.diamond.demo.customercontext.acl.ports.repositories;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.diamond.demo.customercontext.domain.Customer;

import java.util.Optional;

@Repository
public interface CustomerRepository {
    Optional<Customer> customerOf(String customerId);
}
