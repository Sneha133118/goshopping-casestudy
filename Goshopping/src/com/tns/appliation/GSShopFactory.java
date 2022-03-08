package com.tns.appliation;



import com.tns.framework.*;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc p = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {

		NormalAcc n = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return n;
	}

	
	public static void main(String[] args) {

		float charge = 1000;

		GSShopFactory u = new GSShopFactory();

		PrimeAcc p = u.getNewPrimeAccount(1, "sneha1", 1000, true);
		NormalAcc n = u.getNewNormalAccount(2, "sneha2", 1000, 50);

		p.bookProduct(charge);
		n.bookProduct(charge);
	}

}
