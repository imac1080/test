import java.io.File;
import java.io.RandomAccessFile;

public class binario {
	public static void main(String[] args) {
		File f = new File("File.bin");
		System.out.println(f.length());
		try {
			RandomAccessFile raf2 = new RandomAccessFile(f, "rw");
			long apuntador = raf2.getFilePointer();
			//apuntador
			raf2.setLength(16);
			// writeChars = String
			raf2.writeChars("Esto es una frase");
			raf2.seek(0);
			for (int i = 0; i < f.length()/2; i++) {
				System.out.println(raf2.readChar());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
