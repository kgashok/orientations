import java.io.*;

/*
 @Purpose   : This Program opens an existing file and appends text(CHENNAI) to that file.
 */
public class RandomAccessFileTryOut {
	public static void main(String args[]) {
		RandomAccessFile randomFile;
		try {
			randomFile = new RandomAccessFile("city.txt", "rw");
			randomFile.seek(randomFile.length());
			randomFile.writeBytes("\nCHENNAI");
			randomFile.close();
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}
