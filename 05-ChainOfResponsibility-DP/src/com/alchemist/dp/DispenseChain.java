package com.alchemist.dp;

public interface DispenseChain {
	void dispence(Currency currency);
	void chain(DispenseChain chain);
}
