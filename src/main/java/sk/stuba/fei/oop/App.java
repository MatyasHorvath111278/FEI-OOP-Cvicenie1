package sk.stuba.fei.oop;

public class  App {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            App.printInt(i);
        }

    }
    public static void  printInt(int i) {
        System.out.println(String.format("Funkcia bola zavolena %d. krat, ",i));
        if(i == 0){
            System.out.println(String.format("zaujimavy vypis"));
        }

    }
}
