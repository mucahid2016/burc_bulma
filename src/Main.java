import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        if (month==12 && day>=22 || month==1 && day<=21){
            System.out.println("Oğlak");
        }else if(month==1 || month==2 && day<=19){
            System.out.println("Kova");
        }else if(month==2 || month==3 && day<=20){
            System.out.println("Balık");
        }else if (month==3 || month==4 && day<=20){
            System.out.println("Koç");
        }else if (month==4 || month==5 && day<=21){
            System.out.println("Boğa");
        }else if(month==5 || month==6 && day<=22){
            System.out.println("İkizler");
        }else if(month==6 || month==7 && day<=22){
            System.out.println("Yengeç");
        }else if(month==7 || month==8 && day<=22){
            System.out.println("Aslan");
        }else if(month==8 || month==9 && day<=22){
            System.out.println("Başak");
        }else if (month==9||month==10 && day<=22){
            System.out.println("Terazi");
        }else if (month ==10 || month==11 && day<=21){
            System.out.println("Akrep");
        }else if (month==11 || month==12 && day<=21){
            System.out.println("Yay");
        }else {
            System.out.println("Yanlış Giriş Yaptınız");
        }


//        switch (month) {
//            case 1:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc = "Oğlak";
//                    } else {
//                        burc = "Kova";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 2:
//                if (day >= 1 && day <= 28) {
//                    if (day < 20) {
//                        burc = "Kova";
//                    } else {
//                        burc = "Balık";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 3:
//                if (day >= 1 && day <= 31) {
//                    if (day < 21) {
//                        burc = "Balık";
//                    } else {
//                        burc = "Koç";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 4:
//                if (day >= 1 && day <= 30) {
//                    if (day < 21) {
//                        burc = "Koç";
//                    } else {
//                        burc = "Boğa";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 5:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc = "Boğa";
//                    } else {
//                        burc = "İkizler";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 6:
//                if (day >= 1 && day <= 30) {
//                    if ((day < 23)) {
//                        burc = "İkizler";
//                    } else {
//                        burc = "Yengeç";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 7:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc = "Yengeç";
//                    } else {
//                        burc = "Aslan";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 8:
//                if (day >= 1 && day <= 30) {
//                    if (day < 23) {
//                        burc = "Aslan";
//                    } else {
//                        burc = "Başak";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 9:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc = "Başak";
//                    } else {
//                        burc = "Terazi";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 10:
//                if (day >= 1 && day <= 30) {
//                    if (day < 23) {
//                        burc = "Terazi";
//                    } else {
//                        burc = "Akrep";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 11:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc = "Akrep";
//                    } else {
//                        burc = "Yay";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 12:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc = "Yay";
//                    } else {
//                        burc = "Oğlak";
//                    }
//                }
//            default:
//                isError=true;
//        }
//
//        if (isError){
//            System.out.println("Hatalı Giriş Yaptınız");
//        }else{
//            System.out.println("Burcunuz: "+burc);
//        }
    }
}
