public class MegaBytesConverter {
 public static void printMegaBytesAndKiloBytes(int kiloBytes){
     if(kiloBytes<0){
         System.out.println("Invalid Value");
     }
     else{
         int convertByte=kiloBytes;
         int megaByte=(convertByte/1024);
         int rkiloByte=(convertByte%1024);
         System.out.println(convertByte + " KB = " + megaByte + " MB and " +rkiloByte + " KB");
     }
 }
}
