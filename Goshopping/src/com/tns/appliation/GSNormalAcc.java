package com.tns.appliation;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		super(AccNo, accNm, charges, deliveryCharges);
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("Dear Normal User, Your Product Charges are : " + charges + " with Delivery charges is : "
				+ super.getDeliverycharges());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
