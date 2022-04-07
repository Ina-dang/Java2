package a220405;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;

public class FileEx4 {
	public static void main(String[] args) {
		String currDir = System.getProperty("user.dir");
		File dir = new File("D:\\devtools");
		
		File[] files = dir.listFiles((d, name) -> new File(d, name).length() > 1024 * 1024);
		
		for (File f : files) {
			String name = f.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mma");
			String attribute = "";
			long size = 0;
			if(f.isDirectory()) {
				attribute = "DIR";
			}
			else {
				size = f.length();
				attribute = f.canRead() ? "R" : "";
				attribute += f.canWrite() ? "M" : "";
				attribute += f.canExecute() ? "X" : "";
			}
			System.out.printf("%s %3s %6s %s\n", sdf.format(f.lastModified()), attribute, size, name);
		}
	}
}
