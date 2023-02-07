/**
 * DuniaRobot.java
 * program utama DuniaRobot.java.
 * @author 18221121 Rozan Ghosani
 */
import java.util.*;

public class DuniaRobot {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
			int type = sc.nextInt();
			
			if (type == 1) {
				int nPart = Integer.parseInt(sc.next());
				int nTrns = Integer.parseInt(sc.next());
				boolean isAct = sc.nextBoolean();
				
				Bumblebee b = new Bumblebee(nPart, isAct);
				while (nTrns > 0) {
					b.addTransformation();
					nTrns--;
				}
				
				System.out.println(b.toString());
				System.out.println("Jumlah transformasi: " + b.getTotalTransformation());
				System.out.println("Harga robot: " + b.getPrice());
			} else if (type == 2) {
				long prc = sc.nextLong();
				int nModel = Integer.parseInt(sc.next());
				
				Sirik s = new Sirik(prc);
				while (nModel > 0) {
					s.addModel();
					nModel--;
				}
				
				System.out.println(s.toString());
				System.out.println("Jumlah model: " + s.getTotalModel());
				System.out.println("Harga robot: " + s.getPrice());
			} else if (type == 3) {
				long ml = sc.nextLong();
				boolean isAct = sc.nextBoolean();
				
				WallE w = new WallE(ml, isAct);
				
				System.out.println(w.toString());
				System.out.println("Jumlah mileage: " + w.getMileage());
				System.out.println("Harga robot: " + w.getPrice());
			}
			
		sc.close(); 
    }
}
