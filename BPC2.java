package cv3;

import java.util.Scanner;

public class BPC2 implements Predmet {
	
	private int max_bod_projekt = 20;
	private int max_bod_pul_zkouska = 50;
	private int max_bod_zkouska = 80;
	private int body = 0;
	Scanner sc = new Scanner(System.in);
	
	
	public String nazev_predmetu() {
		return "BPC2";
	}
	
	public int pocet_bodu() {
		return 50;
	}
	public void pozadavek_zapoctu() {
		if (this.body >= zapocet) {
			System.out.println("Mate zapocet");
			
		}else {
			System.out.println("Nemate zapocet");
		}
	}
	
	public void projekt() {
		System.out.print("Zadejte bod projektu ");
		int bod = sc.nextInt();
		if(bod < max_bod_projekt) {
			this.body += bod;
		}
	}
	
	public void pul_zkouska() {
		System.out.print("Zadejte bod pul semestralniho testu ");
		int bod = sc.nextInt();
		if(bod < max_bod_pul_zkouska) {
			this.body += bod;
		}
	}
	
	public void zkouska() {
		System.out.print("Zadejte bod zkousky ");
		int bod = sc.nextInt();
		if(bod < max_bod_zkouska) {
			this.body += bod;
		}
	}

}
