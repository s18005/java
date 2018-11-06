import java.util.*;

class Ex4{

	public int [] ex4_1(int [] a){
	    Arrays.sort(a);
		return a;
	}

	public int [] ex4_2(int [] a){
	    List<Integer> list = new ArrayList<Integer>();
	    for (int i : a) {
		list.add(i);
	    }
	    Collections.sort(list, Comparator.reverseOrder());
	    int [] array = new int[list.size()];
	    for (int i = 0 ; i < array.length; i++) {
		array[i] = list.get(i);
	    }
		return array;

	}

	public String [] ex4_3(int [] a){
		
		String [] hantei = new String[a.length];
		for (int i = 0; i < a.length; i++) {
		    if (a[i] > 0) {
			hantei[i] = "正";
		    } else if (a[i] < 0) {
			hantei[i] = "負";
		    } else {
			hantei[i] = "零";
		    }
		}
		return hantei;

	}

	public int ex4_4(int a){
	    return String.valueOf(a).length();
	}

	public int ex4_5(int a){
	    int result = 0;
            for (int i = 1; i < a+1; i++) {
                result += i;
            }
            return result;
	}

	public int [] ex4_6(int a){
	    List<Integer> list = new ArrayList<>();
	    for (int i = 1; i < a+1; i++) {
		if (a % i == 0) {
		    list.add(i);
		}
	    }
	    int[] ret = new int[list.size()];
	    for (int i = 0; i < ret.length; i++) {
		ret[i] = list.get(i);
	    }
	        return ret;

	}

	public boolean ex4_7(int a){
	    if (a == 1) {
                return false;
            }
            if (a == 2) {
                return true;
            }
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
		return true;
	}
	

	public int ex4_8(int [] a){
		
		int ret = 0;
		for (int i = 0; i < a.length; i++) {
		    ret += a[i];
		}
		return ret;
	}

	public int ex4_9(int [] a){	
		int ret = 0;
		for (int i = 0; i < a.length; i++) {
		    ret += a[i];
		}
		return (int) Math.round((double) ret / a.length);
	}
}

