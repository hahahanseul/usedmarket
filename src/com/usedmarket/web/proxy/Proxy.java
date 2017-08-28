package com.usedmarket.web.proxy;

import javax.servlet.http.HttpServletRequest;
import lombok.Getter;

public abstract class Proxy {
	@Getter protected HttpServletRequest request;
	public Proxy(HttpServletRequest request) {
		this.request = request;
	}
}
