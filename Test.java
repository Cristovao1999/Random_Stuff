package cv3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BPC1 bpc1 = new BPC1();
		BPC2 bpc2 = new BPC2();
		BPIS bpis = new BPIS();
		boolean run = true;
		
		while(run){
			System.out.println("\t\t------------------");
			System.out.println("\t\t| Zvolte predmet | ");
			System.out.println("\t\t------------------");
			System.out.println("[1] - BPC1");
			System.out.println("[2] - BPC2");
			System.out.println("[3] - BPIS");
			System.out.println("[4] - Exit");
			int vyber = sc.nextInt();
			
			switch(vyber) {
				case 1:
					boolean r1 = true;
					while(r1) {
						System.out.println("\tPredmet: " + bpc1.nazev_predmetu());
						System.out.println();
						System.out.println("[1] - Cviceni");
						System.out.println("[2] - Zkouska");
						System.out.println("[3] - Pocet bodu");
						System.out.println("[4] - Zapocet");
						System.out.println("[5] - Exit");
						int v1 = sc.nextInt();
						switch(v1) {
							case 1:
								bpc1.cviceni();
								break;
							case 2:
								bpc1.zkouska();
								break;
							case 3:
								System.out.println(bpc1.pocet_bodu());
								break;
							case 4:
								bpc1.pozadavek_zapoctu();
								break;
							case 5:
								r1 = false;
								
						}
					}

					break;
				case 2:
					System.out.println("Nazev predmetu: " + bpc2.nazev_predmetu());
					break;
				case 3:
					System.out.println("Nazev predmetu: " + bpis.nazev_predmetu());
					break;
				case 4:
					run = false;
			
			}
		}
	}

}
