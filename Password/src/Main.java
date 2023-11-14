import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Kullanıcı Adı Giriniz: ");
        String UserName = input.nextLine();

        System.out.printf("Şifre Giriniz: ");
        String Password = input.nextLine();

        String DefultUserName = "Melik";
        String DefultPassword = "1234";

        if(UserName==DefultUserName && Password==DefultPassword){
            System.out.printf("Hoş Geldiniz");
        }
        else{
            System.out.printf("Şifreniz veya Kullanıcı Adınız Yanlış Sıfırlamak İster Misiniz: y/n");
            String onay = input.nextLine();
            if(onay=="y"){
                PasswordReset(DefultUserName,DefultPassword,Password);
            }
            if(onay=="n"){
                System.out.printf("Şifreniz Sıfırlanmadı !!!");
            }
            else {
                System.out.printf("Geçersiz İşlem !!!");
            }
        }

    }
    public static void PasswordReset(String DefaultUserName, String DefaultPassword,String InputPassword){
        Scanner input = new Scanner(System.in);
        System.out.printf("Yeni Şifrenizi Giriniz: ");
        String NewPassword = input.nextLine();

        System.out.printf("Şifrenizi Tekrar Giriniz: ");
        String NewPasswordTry = input.nextLine();

        System.out.printf("Yeni Kullanıcı Adınızı Giriniz: ");
        String NewUserName = input.nextLine();

        if (NewPassword == NewPasswordTry && NewPassword!=DefaultPassword && NewPassword!=InputPassword ){
            System.out.printf("** Şifre Değiştirme İşlemi Başarılı **");
        }
        else {
            System.out.printf("!! Şifre Değiştirme İşlemi Başarısız !!");
        }

    }
}