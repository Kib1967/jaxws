package com.mckibbin.jaxws.impl;

import javax.jws.WebService;

import com.mckibbin.jaxws.GetSquare;

@WebService(
	targetNamespace="com.mckibbin",
	endpointInterface = "com.mckibbin.jaxws.GetSquare",
	serviceName = "GetSquare")
public class GetSquareImpl implements GetSquare {

	@Override
	public int getSquare(int value) {
		return value * value;
	}

}
