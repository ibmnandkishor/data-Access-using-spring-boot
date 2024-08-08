package com.data;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


@Component
public class UserDao {

    public static int userCount = 4;
    private static List<User> users = new ArrayList<>();

  
    static {
		users.add(new User(1, "Aditya", "aditya@gmail.com", "aditya"));
        users.add(new User(2, "Nandkishor", "nand@gmail.com", "aditya"));
        users.add(new User(3, "Aditi", "aditi@gmail.com", "aditi"));
        users.add(new User(4, "Ankita", "ankita@gmail.com", "ankita"));
        users.add(new User(5, "Aditi", "aditi@gmail.com", "aditi"));
    }

    public List<User> findAll()
	{
		return users;
	}
	
	public User save(User user)
	{
		if(user.getId()==null)
		{
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

    public User findOne(int id)  
	{  
	for(User user:users)  
	{  
	if(user.getId()==id)  
	return user;  
	}  
	return null;  
	}  
}
