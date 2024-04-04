package yeni2;

public class Liste {
	Bagli on;
	Bagli arka;
	void elemanEkle(int x , String a) {
		Bagli eleman = new Bagli();
		eleman.oncelik = x;
		eleman.icerik = a;
		Bagli ref = on;
		if (on == null) {
			on = eleman;
			arka = eleman;
		}
		else if (on!= null && arka == null) {
			arka = eleman;
			on.next = eleman;
		}
		else if (eleman.oncelik<on.oncelik) {
			eleman.next = on;
			on = eleman;
		}
		else if (eleman.oncelik> arka.oncelik) {
			arka.next = eleman;
			arka = eleman;
		}
		else {
			while (ref!= null) {
				if(eleman.oncelik< ref.oncelik) {
					eleman.next = ref;
					ref = eleman;
				}
				else if (eleman.oncelik>= ref.oncelik) {
					ref = ref.next;
				}
			}
		}
	}

	void yazdir() {
		Bagli ref2 = on;
		while (ref2 != null) {
			System.out.println("Elemanın Önceliği -> " + ref2.oncelik + "  Elemanın İçeriği -> " + ref2.icerik);
			ref2 = ref2.next;
		}
	}
}
