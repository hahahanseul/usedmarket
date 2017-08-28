package com.usedmarket.web.proxy;

import javax.servlet.http.HttpServletRequest;

public class SendProxy extends Proxy{

	public SendProxy(HttpServletRequest request) {
		super(request);
	}
}
