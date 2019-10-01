package com.zensar.services;

import java.util.List;

import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;

/**
 * @author Arib Anwar, 2019.
 * @version 0.1
 * @creation_date Sep. 21, 2019 05:30PM
 * @modification_date Sep. 21, 2019 05:30PM
 * @copyright Zensar Technologies, India. All rights reserved.
 * @description It is Data Access Object (DAO) interface.
 * 				It is used in Persistence Layer of Application.
*/

public interface UserService {
	
	void addUser(User user) throws ServiceException;
	void updateUser(User user) throws ServiceException;
	void removeUser(User user) throws ServiceException;
	User findUserByUsername(String username) throws ServiceException;
	List<User> findAllUsers() throws ServiceException;
	
	boolean validateUser(User user) throws ServiceException;

}
