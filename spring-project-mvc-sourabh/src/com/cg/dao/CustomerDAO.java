/*
 *
 * created by Sourabh Gour
 */
package com.cg.dao;

import java.util.List;

import com.cg.pojos.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}
