package Hemanchal;

public class CalculateArmstrong {
	
	public static int findingArmstron(int num) {
		int arm=0;
		while(num > 0) {
			int r=num % 10;
			arm +=r*r*r;
			num /=10;
		}
		return arm;
	}

}
