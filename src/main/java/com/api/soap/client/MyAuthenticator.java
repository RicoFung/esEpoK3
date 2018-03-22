package com.api.soap.client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class MyAuthenticator extends Authenticator
{
	protected PasswordAuthentication getPasswordAuthentication()
	{
		return new PasswordAuthentication("epoApiClient", "888888".toCharArray());
	}
}
