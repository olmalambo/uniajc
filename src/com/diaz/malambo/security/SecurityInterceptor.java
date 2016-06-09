package com.diaz.malambo.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.Headers;
import org.jboss.resteasy.core.ServerResponse;

/**
 * 
 * SecurityInterceptor
 * 

 * @author 		Jeison Molina
 * @since 		20/12/2013
 * 
 * Derechos Reservados de Autor.
 * (C) IP Total Software S.A 
 *
 * Historia de Modificaciones
 * -------------------------------------------------------------
 * Autor	          Fecha           Modificacion 
 * -----------------  -------------- ----------------------------
 */

@Provider
@ServerInterceptor
public final class SecurityInterceptor implements ContainerRequestFilter, ContainerResponseFilter
{
	public static boolean isLogged = true;
	private static final String AUTHORIZATION_PROPERTY = "Authorization";
	private static final String AUTHENTICATION_SCHEME = "Basic";
	private static final ServerResponse ACCESS_DENIED = new ServerResponse("Access denied for this resource", 401,
	        new Headers<Object>());
	private static final ServerResponse ACCESS_FORBIDDEN = new ServerResponse("Nobody can access this resource", 403,
	        new Headers<Object>());
	private static final ServerResponse SERVER_ERROR = new ServerResponse("INTERNAL SERVER ERROR", 500,
	        new Headers<Object>());
	
	@Context
	HttpServletRequest req;

	/**
	 * Filtro para peticiones salientes del servidor
	 */
    @Override
    public void filter(ContainerRequestContext arg0, ContainerResponseContext context) throws IOException
    {
    	System.out.println("llego ");
    	context.getHeaders().add("Access-Control-Allow-Origin", "*");
    	context.getHeaders().add("Access-Control-Max-Age", "3600");
		context.getHeaders().add("Access-Control-Allow-Headers", "content-type");
		context.getHeaders().add("Access-Control-Allow-Methods", "POST");
    }

	/**
	 * Filtro para peticiones entrantes al servidor
	 */
    @Override
    public void filter(ContainerRequestContext arg0) throws IOException
    {

    }
}
