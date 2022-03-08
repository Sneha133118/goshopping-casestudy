package com.tns.appliation;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float Charges = 50;

	public float getCharges() {
		return Charges;
	}

	public GSPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		super(AccNo, accNm, charges, isPrime);
	}

//	Override
	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, Your Product Charges are : " + charges );
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [getCharges()=" + getCharges() + ", getisPrime()=" + getisPrime() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
