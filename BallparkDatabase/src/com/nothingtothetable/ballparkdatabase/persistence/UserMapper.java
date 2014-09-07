package com.nothingtothetable.ballparkdatabase.persistence;

import java.util.List;

import com.nothingtothetable.ballparkdatabase.domain.User;

public interface UserMapper {
	public List<User> getAllUsers();
}
