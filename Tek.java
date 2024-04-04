package yeni2;

public class Tek {

	public static void main(String[] args) {
		Liste listem = new Liste();
		listem.elemanEkle(1, "Emre");
		listem.elemanEkle(2, "33");
		listem.elemanEkle(3, "Kral");
		listem.elemanEkle(3, "Üçbudak");
		listem.elemanEkle(4, "Üçbudak");
		listem.elemanEkle(5, "Üçbudak");
		listem.yazdir();

	}

}
