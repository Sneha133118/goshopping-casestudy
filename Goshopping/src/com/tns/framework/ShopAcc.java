package com.tns.framework;

public abstract class ShopAcc {
//	accNo
	private int accNo;

	public int getAccNo() {
		return accNo;
	}

//	accNm
	private String accNm;

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

//	charges
	private float charges;

	public float getCharges() {
		return charges;
	}

//	Constructor
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

//	Override
	public abstract void bookProduct(float f);

	public void items(float f) {

	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
