package com.api.soap.client;

import java.net.Authenticator;

public class Test
{
	public static void main(String[] args)
	{
		// 认证
		Authenticator.setDefault(new MyAuthenticator());
		try
		{
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
