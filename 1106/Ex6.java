import java.util.*;

class Ex6{

    public int [] ex6_1(){

        int [] ret = {5,4,3,2,1};

        return ret;
    }

    public double [] ex6_2(){

        double [] ret = {1.1,2.2,3.3,4.4,5.5};

        return ret;
    }

    public int [] ex6_3(int a, int b){

        int [] ret = new int[a];
	for (int i = 0; i < a; i++) {
	    ret[i] = b;
	}
        return ret;
    }

    public int [] ex6_4(int [] a){

        int sum = 0;
        int ave;
        int max = a[0];
        int min = a[0];
        for (int i: a) {
            sum += i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        ave = (int)Math.round((double)sum / a.length);
        int[] ret = {sum, ave, max, min};
	    return ret;
	}

    public int ex6_5(int [] a, int key){

        int ret = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == key && key != -1) {
		ret++;
	    } if (key == -1) {
		if (a[i] > ret) {
		    ret = a[i];
		}
	    }
	}
	if (ret == 0 && key != -1) {
	    return -1;
	} else if (ret == a.length && key != -1) {
	    return 0;
	} else { 
            return ret;
	}
    }
    
    public int ex6_6(int [] a, int key){

        int ret = -1;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == key) {
		ret = i;
	    }
	}
        return ret;
    }

    public int [] ex6_7(int [] a, int idx){
	List<Integer> list = new ArrayList<Integer>();
	for (int i: a) {
	    list.add(i);
	}
	list.remove(idx);
        int [] ret = new int[list.size()];
	for (int i = 0; i < ret.length; i++) {
	    ret[i] = list.get(i);
	}
        return ret;
    }

    public int [] ex6_8(int [] a, int idx, int n){

        if (idx + n > a.length) return a;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            list.remove(idx);
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }


    public int [] ex6_9(int [] a, int idx, int x){

        List<Integer> list = new ArrayList<Integer>();
        for (int i: a) {
            list.add(i);
        }
        list.add(idx, x);
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    public void ex6_10(int [] a, int [] b){
        if (a.length <= b.length) {
	    int [] c = new int[a.length];
	    for (int i = 0; i < a.length; i++) {
	        c[i] = a[i];
	        a[i] = b[i];
	        b[i] = c[i];
	    }
        } if (b.length < a.length) {
	    int[] d = new int[b.length];
	    for (int k = 0; k < b.length; k++) {
	        d[k] = b[k];	
	        b[k] = a[k];
	        a[k] = d[k];
	    }
        }
        return;
    }
	    

    public int [] ex6_11(int [] a){

        int [] ret = new int[a.length];
	for (int i = 0; i < a.length; i++) {
	    ret[i] = a[i];
	}
        return ret;
    }

    public int [] ex6_12(int [] a, int x){

        int val = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == x) {
		val++;
	    }
	}
	int [] ret = new int[val];
	int index = 0;
	for (int k = 0; k < a.length; k++) {
	    if (a[k] == x) {
		ret[index] = k;
		index++;
	    }
	}
        return ret;
    }

    public int [] ex6_13(int [] a, int idx){

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (i != idx) {
                list.add(a[i]);
            }
        }
        int [] ret = new int [list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    public int [] ex6_14(int [] a, int idx, int n){

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            if (list.size() <= idx) break;
            list.remove(idx);
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    public int [] ex6_15(int [] a, int idx, int x){

        if (idx == -1) idx = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i: a) {
            list.add(i);
        }
        list.add(idx, x);
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

}
