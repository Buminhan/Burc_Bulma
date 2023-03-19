import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        byte gun;
        String ay;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen hangi ay doğduğunuzu giriniz.");
        ay = inp.nextLine();
        System.out.println("Lütfen ayın hangi günü doğduğunuzu giriniz.");
        gun = inp.nextByte();
        if(ay.equals("Ocak")||ay.equals("ocak")){
            if(gun>0 && gun<=21){
                System.out.println("Burcunuz : Oğlak");
            }
            else if(gun>22 && gun <=31){
                System.out.println("Burcunuz : Kova");
            }
            else{
                System.out.println("Günü yanlış girdiniz.");
            }
        }
        else if(ay.equals("Şubat")||ay.equals("şubat")){
            if(gun>0 && gun<=19){
                System.out.println("Burcunuz : Kova");
            }
            else if(gun>19 && gun<=29){
                System.out.println("Burcunuz : Balık");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Mart")||ay.equals("mart")){
            if(gun>0 && gun<=20){
                System.out.println("Burcunuz : Balık");
            }
            else if(gun>20 && gun<=31){
                System.out.println("Burcunuz : Koç");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Nisan")||ay.equals("nisan")){
            if(gun>0 && gun<=20){
                System.out.println("Burcunuz : Koç");
            }
            else if(gun>20 && gun<=30){
                System.out.println("Burcunuz : Boğa");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Mayıs")||ay.equals("mayıs")){
            if(gun>0 && gun<=21){
                System.out.println("Burcunuz : Boğa");
            }
            else if(gun>21 && gun<=31){
                System.out.println("Burcunuz : İkizler");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Haziran")||ay.equals("haziran")){
            if(gun>0 && gun<=22){
                System.out.println("Burcunuz : İkizler");
            }
            else if(gun>22 && gun<=30){
                System.out.println("Burcunuz : Yengeç");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Temmuz")||ay.equals("temmuz")){
            if(gun>0 && gun<=22){
                System.out.println("Burcunuz : Yengeç");
            }
            else if(gun>22 && gun<=31){
                System.out.println("Burcunuz : Aslan");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Ağustos")||ay.equals("ağustos")){
            if(gun>0 && gun<=22){
                System.out.println("Burcunuz : Aslan");
            }
            else if(gun>22 && gun<=31){
                System.out.println("Burcunuz : Başak");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Eylül")||ay.equals("eylül")){
            if(gun>0 && gun<=22){
                System.out.println("Burcunuz : Başak");
            }
            else if(gun>22 && gun<=30){
                System.out.println("Burcunuz : Terazi");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Ekim")||ay.equals("ekim")){
            if(gun>0 && gun<=22){
                System.out.println("Burcunuz : Terazi");
            }
            else if(gun>20 && gun<=31){
                System.out.println("Burcunuz : Akrep");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Kasım")||ay.equals("kasım")){
            if(gun>0 && gun<=21){
                System.out.println("Burcunuz : Akrep");
            }
            else if(gun>21 && gun<=30){
                System.out.println("Burcunuz : Yay");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else if(ay.equals("Aralık")||ay.equals("aralık")){
            if(gun>0 && gun<=22){
                System.out.println("Burcunuz : Yay");
            }
            else if(gun>22 && gun<=31){
                System.out.println("Burcunuz : Oğlak");
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }
        else {
            System.out.println("Ayı yanlış girdiniz. "+ay+" böyle bi ay ismi yok.");
        }
    }
}