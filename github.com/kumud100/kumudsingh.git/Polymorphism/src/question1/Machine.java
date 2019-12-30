package question1;

public class Machine {
	
	public int ProduceShoeplish(int coalPieces) {
		
		if(coalPieces==5)
		return 100;
		else {
			System.out.println("100 ml for 5 pieces");
			return 0;
		}
		
	}
	public int ProduceShoeplish(float hairStrand) {
		
		if(hairStrand==(float)9.83)
			return 100;
		else
			return 0;
		
	}
	
	public int ProduceShoeplish(String coalMsg) {
		String[] s=coalMsg.split(" ");
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].equalsIgnoreCase("coal"))
				count++;
		}
			if(count==27)
				return 100;
			else
				return 0;
		}
		
	}
