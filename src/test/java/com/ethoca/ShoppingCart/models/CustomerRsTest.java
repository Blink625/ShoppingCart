package com.ethoca.ShoppingCart.models;

import com.ethoca.ShoppingCart.entities.CustomerEntity;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@AutoConfigureTestDatabase
@ActiveProfiles("test")
@SpringBootTest
public class CustomerRsTest {

    @Mock
    private List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();

    @Test
    public void allConstructorTest(){
        CustomerRs customer = new CustomerRs();
        CustomerRs customer2 = new CustomerRs(customerList);

        assertNotNull(customer);
        assertNotNull(customer2);
    }

    @Test
    public void getterAndSetterTest() {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName("Captain");
        customerEntity.setLastName("America");
        customerEntity.setEmailAddress("captain@america.com");

        assertEquals("Captain", customerEntity.getFirstName());
        assertEquals("America", customerEntity.getLastName());
        assertEquals("captain@america.com", customerEntity.getEmailAddress());

        List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
        customerList.add(customerEntity);


        assertEquals("America", customerList.get(0).getLastName());
        assertEquals("captain@america.com", customerList.get(0).getEmailAddress());
    }

    @Test
    void getCustomerEntityList() {

        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName("Captain");
        customerEntity.setLastName("America");
        customerEntity.setEmailAddress("captain@america.com");

        List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
        customerList.add(customerEntity);

        customerList.add(customerEntity);

        assertEquals("Captain", customerList.get(0).getFirstName());
    }

    @Test
    void setCustomerEntityList() {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName("Captain");
        customerEntity.setLastName("America");
        customerEntity.setEmailAddress("captain@america.com");

        List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
        customerList.add(customerEntity);

        customerList.get(0).setLastName("Kelly");
        assertEquals("Kelly", customerList.get(0).getLastName());
    }

    @Test
    void testEquals() {
    }

    @Test
    void canEqual() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}
