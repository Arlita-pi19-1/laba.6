import java.io.*;
public class Look {

    public static void main(String[] args) throws IOException {
        Reader in = null; // можно сразу записать FileReader in=null;
        Writer out = null; // можно сразу записать FileWriter out =null;

        try {
            in = new FileReader("E:\\MyFile1.txt"); // файл для чтения
            out = new FileWriter("E:\\MyFile2.txt", true);
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }

    }
}



