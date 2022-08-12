import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        int day;
        boolean isError = false;
        String burc="Ayı doğru giriniz.";
        String month="";
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı küçük harfler ile yazınız");
        month = input.nextLine();

        System.out.println("Doğduğunuz gün?");
        day = input.nextInt();

            if (month.equals("ocak")) {
                if ((day >= 1) && (day <= 31)) {
                    if ((day <= 22)) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("subat")) {
                if ((day >= 1) && (day <= 29)) {
                    if (day <= 19) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("mart")) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 20) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("nisan")) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 20) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("mayıs")) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 21) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("haziran")) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 22) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("temmuz")) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("agustos")) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("eylül")) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 22) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("ekim")) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("kasım")) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 21) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            }
            if (month.equals("aralık")) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 21) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }

            if (isError) {
                System.out.println("Hatalı giriş yaptınız!!");
            } else {
                System.out.println("Burcunuz: "+burc);
            }
    }
}
