import java.io.*;
import java.util.*;

public class suratKaizer {
  public static final String abjad = "abcdefghijklmnopqrstuvwxyz";

  public static String metodeKaizer(String pesan, int n) {
    pesan = pesan.toLowerCase();
    String teksKaizer = "";
    for (int i = 0; i < pesan.length(); i++) {
      int posisiHuruf = abjad.indexOf(pesan.charAt(i));
      int nilaiN = (n + posisiHuruf) % 26;
      char replaceVal = abjad.charAt(nilaiN);
      teksKaizer += replaceVal;
    }
    return teksKaizer.substring(0, 1).toUpperCase() + teksKaizer.substring(1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pesan = sc.nextLine();
    int n = sc.nextInt();
    System.out.println(metodeKaizer(pesan, n));
  }
}
