package com.mckibbin.jaxws;

import javax.jws.WebService;

@WebService(
	targetNamespace="com.mckibbin"
)
public interface GetSquare {
	public int getSquare(int value);
}
