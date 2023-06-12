package Project.OrderManagementDemo.repository;

import Project.OrderManagementDemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {


   public Customer getCustomerByAdressAndName(String adress,String name);
}
