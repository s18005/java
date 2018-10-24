import java.io.*;

public class Main {
    private static final String LINE_SEPARATOR = System.lineSeparator();

    public static void main(String[] args) {
	final String fileName = "Test.txt";
	//final String content = "abc";
	if (writeToFile(fileName, readFromFile("Main.java"))) {
	    System.out.println(String.format("ファイルへの書き込みに成功しました: %s", fileName));
	} else {
	    System.out.println(String.format("ファイルへの書き込みに失敗しました: %s", fileName));
	}
    }
    
    public static String readFromFile(String fileName) {
	File file = new File(fileName);
	StringBuilder sb = new StringBuilder();
		
	FileReader fr = null;
	BufferedReader br = null;

	try {
	    fr = new FileReader(file);
	    br = new BufferedReader(fr);
	    String line;

	    while ((line = br.readLine()) != null) {
				sb.append(line).append(LINE_SEPARATOR);
	    }

	    return sb.toString();

	 } catch (FileNotFoundException e) {
	     System.err.println(String.format(
	         "ファイルが見つかりません：%s", fileName));
		 return null;
		
	 } catch (IOException e) {
	     System.err.println(String.format(
	         "ファイル読み込みに失敗した：%s", fileName));
		 return null;
	 } finally {
	     closeSilently(br);
	     closeSilently(fr);
	 }
	}
	
    private static void closeSilently(AutoCloseable target) {
	if (target != null) {
	    try {
	        target.close();
	    } catch (Exception e) {}
	}
    }


    private static boolean writeToFile(String fileName, String context) {
	File file = new File(fileName);
	try (
	    FileWriter fw = new FileWriter(file);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter pw = new PrintWriter(bw);
	) {
	    pw.println(context);
	    return true;
	} catch (IOException e) {
	    return false;
	}
    }
}
