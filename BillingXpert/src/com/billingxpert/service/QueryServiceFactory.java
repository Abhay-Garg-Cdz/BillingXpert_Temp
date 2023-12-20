package com.billingxpert.service;

public class QueryServiceFactory {
	public static QueryServiceImpl queryService;
	static {
		queryService = new QueryServiceImpl();
	}
	public static QueryService  getQueryService() {
		return queryService;
	}
	
}
