package com.example.dao;

import java.util.List;

import com.example.model.users;

public interface services {
	public boolean isvaliduser(usersdao usersdao, String user);

	public boolean isvalidmail(usersdao usersdao, String user);

	public int updatepassword(usersdao usersdao, users users);

	public int updateuser(usersdao usersdao, users users);

}
