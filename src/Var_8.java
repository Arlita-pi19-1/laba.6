import java.io.*;

public class Var_8 {
    public static void main(String[] args) throws IOException {
        InputStream in=null;
        Reader file=null;
        BufferedReader buf=null;

        OutputStream out=null;
        OutputStreamWriter wr=null;
        try {
            in=new FileInputStream("C:\\Me\\look.txt");
            file=new InputStreamReader(in, "cp1251");
            buf=new BufferedReader(file);

            File f1=new File("C:\\Me\\took.txt");
            f1.createNewFile();

            if(f1.exists()){
                out=new FileOutputStream(f1);
                wr=new OutputStreamWriter(out, "Unicode");

                String line="";
                String[] words;

                int num_line=1;

                String str="line";
                str.length();

                while ((line=buf.readLine()) !=null){
                    wr.write(num_line);
                    words=line.split("");
                    int lenFirst=words[0].length();

                    int count=0;

                    for(int i=1; i<words.length; i++){
                        if (line.length()>5){
                            wr.append(line+"");
                            count++;
                        }
                    }
                    wr.append(count + "\n");
                }

            }

        }
        catch (IOException ie){
            System.out.println("Error" +ie);
        }
        finally {
            in.close();
            out.close();
            buf.close();

        }

    }

}
