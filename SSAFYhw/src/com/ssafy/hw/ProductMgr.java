package com.ssafy.hw;

public class ProductMgr {

	Product[] pd = new Product[6];

	public void saveProduct() {
		pd[0] = new TV(111111, "�ĺ�", "20000", "10��", "30��ġ", "AŸ��");
		pd[1] = new TV(222222, "LG", "1õ����", "100��", "20��ġ", "BŸ��");
		pd[2] = new TV(333333, "�Ｚ", "3õ����", "300��", "50��ġ", "BŸ��");
		pd[3] = new Refrigerator(010, "�Ｚ�����", "500����", "300��", "100L");
		pd[4] = new Refrigerator(123, "LG", "800����", "150��", "300L");
		pd[5] = new Refrigerator(567, "�ڽ���", "900����", "400��", "200L");
		System.out.println("=====1��°=======");
	}

	public void searchAll() {
		for (int i = 0; i < pd.length; i++) {
			System.out.println(pd[i]);
		}
		System.out.println("=====2��°=======");
	}

	public void numbersearch() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i].getNumber() == 010) {
				System.out.println(pd[i]);
			}
		}
		System.out.println("=====3��°=======");
	}

	public void productsearch() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i].getBrand() == "��*") {
				System.out.println(pd[i]);
			}
		}
		System.out.println("=====4��°=======");
	}

	public void TVsearch() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i] instanceof TV) {
				System.out.println(pd[i]);
			}
		}
		System.out.println("=====5��°=======");
	}

	public void Refrigeratorsearch() {
		for (int i = 0; i < pd.length; i++) {
			if (pd[i] instanceof Refrigerator) {
				System.out.println(pd[i]);
			}

		}
		System.out.println("=====6��°=======");
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
