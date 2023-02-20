import java.io.*;

public class filetest {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("test.txt");
            String vowels = "";
            int i;
            while((i=fis.read()) != -1){
                if((char)i == 'a' || (char)i == 'e' ||
                 (char)i == 'i' || (char)i == 'o' || (char)i == 'u'   ){
                    vowels += (char)i;
                }
            }
            System.out.println(vowels);
            fis.close();
            FileOutputStream fos = new FileOutputStream("test1.txt");
            byte[] ba = vowels.getBytes();
            fos.write(ba);
            fos.close();
        }
        catch(Exception e){
            System.out.println("File Not Found");
        }
    }
}
