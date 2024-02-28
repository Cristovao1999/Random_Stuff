package cv3;
import java.util.Scanner;
public class BPC1 implements Predmet{
	
	private int max_bod_cviceni = 20;
	private int max_bod_zkouska = 80;
	private int body = 0;
	Scanner sc = new Scanner(System.in);
	
	
	public String nazev_predmetu() {
		return "BPC1";
	}
	public int pocet_bodu() {
		return body;
	}	
	public void pozadavek_zapoctu() {
		if(body >= zapocet) {
			System.out.println("Mate zapocet!");
			System.out.println();
		}
		else {
			System.out.println("Bohuzel nemate dostatek bodu pro zapocet!");
		}
	}
	
	public void cviceni() {
		int i = 1;
		boolean run = true;
		
		if(this.body < max_bod_cviceni) {
			
			System.out.println("Zadejte body do jednotlivych cviceni");
			System.out.println("Pozn: V pripade konec zadani bodu zmacknete 'k' - [konec]");
			System.out.println();
			
			while (run) {
				
				if(this.body < max_bod_cviceni) {
					
					System.out.print(i + ".cviceni: ");
					int bod = sc.nextInt();
					
					if(bod < max_bod_cviceni) {
						this.body += bod;
						i++;
					}
					//Neni potreba (jen navic)
					else if(bod == max_bod_cviceni) {
						if(this.body == 0) {
							this.body += bod;
							System.out.println("Dosahl jste maximalniho poctu bodu cviceni. Dekuji!");
							break;
						}
					}
					else {
						System.out.println("Bod mimo rozsah (20). Zadejte znova!");
						continue;
					}
				}
				else {
					System.out.println("Mate uz vsechny body zadane!");
					break;
				}


			}
			System.out.println();
			
		}
		else {
			System.out.println("Mate uz vsechny body zadane!");
			System.out.println();
		}
		

	}
	
	public void zkouska() {
		System.out.println("\t\t\tZadejte body ze zkousky");
		int bod = sc.nextInt();
		if(bod <= max_bod_zkouska) {
			this.body += bod;
		}else {
			System.out.println("Bod mimo rozsah!");
		}
		
	}
	
	
}
