import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama file");
        nama = input.nextLine();

        try {
            File objek = new File(nama);
            if (objek.createNewFile())
            {
                System.out.println("file dibyat " + objek.getName());
            }
            else {
                System.out.println("filenya sudah ada");
            }
        }
        catch (Exception er)
        {
            System.out.println(er);

        }

    }
}