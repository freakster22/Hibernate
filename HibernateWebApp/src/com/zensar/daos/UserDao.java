package com.zensar.daos;

import java.util.List;

import com.zensar.entities.User;

/**
 * @author Arib Anwar, 2019.
 * @version 2.1
 * @creation_date Sep. 21, 2019 05:30PM
 * @modification_date Sep. 28, 2019 11:19
 * @copyright Zensar Technologies, India. All rights reserved.
 * @description It is Data Access Object (DAO) interface.
 * 				It is used in Persistence Layer of Application.
*/

public interface UserDao {
	
	void insert(User user) ;
	void update(User user) ;
	void delete(User user) ;
	User getByUsername(String username) ;
	List<User> getAll() ;	

}
