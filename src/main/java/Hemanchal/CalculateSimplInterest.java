package Hemanchal;

public class CalculateSimplInterest {
	
	public static double findingSimpleInterest(int p, int r, int t) {
		double si;
		si=(p * r * t) /100;
		return si;
	}

		public static double findingRate(int si, int t, int p) {
			double rate;
			rate=(si *100)/(p * t);
			return rate;
		}
		
		public static double findingPrincipal(int si, int t, int r) {
			double principal;
			principal=(si *100)/(r * t);
			return principal;
		}
		public static double findingTime(int si, int r, int p) {
			double time;
			time=(si *100)/(p * r);
			return time;
		}
		
}
