class sub {
    public static void main(String[] args) {
	for (int i = 1; i <= 100; ++i) {
	    if (i % 3 == 0 || Integer.toString(i).contains("3")) {
		System.out.println("THREE");
	    } else {
		System.out.println(i);
	    }
        }
    }
}
