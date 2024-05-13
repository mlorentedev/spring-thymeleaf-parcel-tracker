package com.dam.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dam.model.Customer;
import com.dam.model.User;
import com.dam.model.UserInfo;
import com.dam.repository.UserRepository;

@SpringBootTest
public class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {
        // Create a new user
        Customer customer = new Customer("customer", "password", new UserInfo());

        // Save the user
        User savedUser = userRepository.save(customer);

        // Verify if the user is present and its attributes are correct
        assertNotNull(savedUser);
        assertEquals(customer.getUsername(), savedUser.getUsername());
        assertEquals(customer.getPassword(), savedUser.getPassword());
        assertEquals(customer.getRol(), savedUser.getRol());
        assertEquals(customer.getUserInfo(), savedUser.getUserInfo());
    }
    
    // Add more tests as needed
}
