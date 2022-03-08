package com.tns.framework;

public abstract class ShopFactory {
	protected abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);

	protected abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);
}
