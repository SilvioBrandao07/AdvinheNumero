import java.util.Scanner;

import java.util.Random;

public  class Main {
public static void main(String[] args) {

    System.out.println("======Descubra o numero!======");

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int numero = random.nextInt(100) + 1;

    System.out.println("Digite o numero:");
    int num = input.nextInt();


    while(true){

        if(num == numero){
            System.out.println("Voce acertou!");
            break;
        }else if(num < numero){
            System.out.println("Muito baixo! Tente novamente!");
        }else{
            System.out.println("Muito Alto Tente novamente!");
        }

        num = input.nextInt();

    }
}

}