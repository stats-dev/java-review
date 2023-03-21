package chap10_abstraction;

import chap10_abstraction.product.Academy;
import chap10_abstraction.product.ComAcademy;

public class _01_academyMain {

	public static void main(String[] args) {
		Academy ac = new ComAcademy();
		ac.teach();
	}

}
