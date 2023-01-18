import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double yil;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("doğduğunuz yılı yazınız : ");
        yil = scanner.nextDouble();
        yil = yil%12;

        switch((int) yil){
            case 0: System.out.println("çin zodyağınız maymundur");
                break;
            case 1: System.out.println("çin zodyağınız horozdur");
                break;
            case 2: System.out.println("çin zodyağınız köpektir");
                break;
            case 3: System.out.println("çin zodyağınız domuzdur");
                break;
            case 4: System.out.println("çin zodyağınız faredir");
                break;
            case 5: System.out.println("çin zodyağınız öküzdür");
                break;
            case 6: System.out.println("çin zodyağınız kaplandır");
                break;
            case 7: System.out.println("çin zodyağınız tavşandır");
                break;
            case 8: System.out.println("çin zodyağınız ejderhadır");
                break;
            case 9: System.out.println("çin zodyağınız yılandır");
                break;
            case 10: System.out.println("çin zodyağınız attır");
                break;
            case 11: System.out.println("çin zodyağınız koyundur");
                break;
            default: System.out.println("yanlış değer girdiniz");



        }


        







    }

}
