package com.webconfig;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import com.api.soap.server.TmppSyncFashionpos0aSoap;

@Configuration
public class CxfConfig
{
	@Bean
	public ServletRegistrationBean cxfServletRegistration()
	{
		return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
	}
	//如果要同时使用spring mvc 和 SOAP两个servlet需要添加以下代码
	@Bean(name = DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
	public DispatcherServlet dispatcherServlet()
	{
		return new DispatcherServlet();
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() 
	{
        return new SpringBus();
    }
	
	@Bean
	public Endpoint endpoint()
	{
		EndpointImpl endpoint = new EndpointImpl(springBus(), new TmppSyncFashionpos0aSoap());
		endpoint.publish("/TmppSyncFashionpos0a");
		return endpoint;
	}
	
	@Bean
	public Endpoint endpoint1()
	{
		EndpointImpl endpoint = new EndpointImpl(springBus(), new TmppSyncFashionpos0aSoap());
		endpoint.publish("/TmppSyncFashionpos0a1");
		return endpoint;
	}
}
