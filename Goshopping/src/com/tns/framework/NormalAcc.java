package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
//	deliveryCharges
	private static final float deliveryCharges = 50;

	public static float getDeliverycharges() {
		return deliveryCharges;
	}

	public NormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		super(AccNo, accNm, charges);
	}

//	Override
	public void bookProduct(float f) {

	}

	@Override
	public String toString() {
		return "NormalAcc [getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
