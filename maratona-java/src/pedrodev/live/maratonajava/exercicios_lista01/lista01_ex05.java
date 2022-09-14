package pedrodev.live.maratonajava.exercicios_lista01;

public class lista01_ex05 {
    /*

                5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
                (1SM=R$788,00)
    */
    public static void main(String[] args) {


        float minimumSalary = 1024F;
        float salary = 2500F;
        float totalMinimumPerUser = salary / minimumSalary;
        System.out.println("Salario Minimo= " + totalMinimumPerUser);
    }
}
