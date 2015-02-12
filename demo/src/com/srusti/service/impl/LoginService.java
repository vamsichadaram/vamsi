package com.srusti.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.dao.impl.LoginDao;
import com.srusti.dto.LoginForm;

@Service
public class LoginService 
{
	@Autowired
	private LoginDao doa;
	public LoginForm check(LoginForm form)
	{
        form=doa.check(form); 
		return form;
	}
}
