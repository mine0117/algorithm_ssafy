package com.ssafy.hw;

public class ProductMgr {

	Product[] pd = new Product[6];

	public void saveProduct() {
		pd[0] = new TV(111111, "파브", "20000", "10개", "30인치", "A타입");
		pd[1] = new TV(222222, "LG", "1천만원", "100개", "20인치", "B타입");
		pd[2] = new TV(333333, "삼성", "3천만원", "300개", "50인치", "B타입");
		pd[3] = new Refrigerator(010, "삼성냉장고", "500만원", "300개", "100L");
		pd[4] = new Refrigerator(123, "LG", "800만원", "150개", "300L");
		pd[5] = new Refrigerator(567, "코스텔", "900만원", "400개", "200L");
		System.out.println("=====1번째=======");
	}

	public void searchAll() {
		for (int i = 0; i < pd.length; i++) {
			System.out.println(pd[i]);
		}
		System.out.println("=====2번째=======");
	}

	public void numbersearch() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i].getNumber() == 010) {
				System.out.println(pd[i]);
			}
		}
		System.out.println("=====3번째=======");
	}

	public void productsearch() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i].getBrand() == "삼*") {
				System.out.println(pd[i]);
			}
		}
		System.out.println("=====4번째=======");
	}

	public void TVsearch() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i] instanceof TV) {
				System.out.println(pd[i]);
			}
		}
		System.out.println("=====5번째=======");
	}

	public void Refrigeratorsearch() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i] instanceof Refrigerator) {
				System.out.println(pd[i]);
			}

		}
		System.out.println("=====6번째=======");
	}

	public void delete() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i].getNumber() == 123) {
				pd[i] = null;
				
			}
			 System.out.println(pd[i]);
		}

	}
	// public void sum() {
	// int sum = 0;
	// for (int i = 0; i < pd.length; i++) {
	// sum += pd[i].getPrice();
	// }
	// }

}
