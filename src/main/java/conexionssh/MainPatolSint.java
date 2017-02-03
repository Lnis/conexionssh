package conexionssh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainPatolSint {

	public static void main(String[] args) {
		
		HashMap<Patologia, List<Sintoma>> hm = null;
		
		Sintoma s1 = new Sintoma(3, "Vision triple");
		Sintoma s2 = new Sintoma(4, "Vision borrosa");
		Sintoma s3 = new Sintoma(5, "Fatiga ocular");
		Sintoma s4 = new Sintoma(1, "Ambliopía");
		Sintoma s5 = new Sintoma(2, "Moscas volantes");
		
		Patologia p1 = new Patologia(1, "Bebido");
		Patologia p2 = new Patologia(1, "Fumado");
		
		List<Sintoma> ls1 = new ArrayList<Sintoma>();
		ls1.add(s1);
		ls1.add(s2);
		ls1.add(s3);
		
		List<Sintoma> ls2 = new ArrayList<Sintoma>();
		ls2.add(s3);
		ls2.add(s4);
		ls2.add(s5);
		
		hm.put(p1, ls1);
	}

}
