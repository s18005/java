class Ex5{

	public double ex5_1(int [] a){
		
		double ret = 0;
		for (int i : a) {
		    ret += i;
		}
		return ret / a.length;
	}
}
