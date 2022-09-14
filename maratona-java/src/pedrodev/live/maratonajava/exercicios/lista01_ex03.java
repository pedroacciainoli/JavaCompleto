package pedrodev.live.maratonajava.exercicios;

public class lista01_ex03 {
/*
    Informar um saldo e imprimir o saldo com reajuste de 1%.
*/
public static void main(String[] args) {
    float value = 3000F;
    float tax = 1 / 100F;
    float total = value * tax;

    System.out.println("Valor reajustado em 1% - " + (value + total));
}
}
