package pedrodev.live.maratonajava.javacore.Hheranca.test;

import pedrodev.live.maratonajava.javacore.Hheranca.domain.Employee;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando JVM carregar classe pai
    // 1 - Bloco de inicialização estático da sub classe  é executado quando JVM carregar classe filha
    // 2 - Alocando espaco em memória pro objeto da superclasse
    // 3 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado da classe pai
    // 4 - Bloco de inicialização da superclasse é executado na ordem que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocando espaco em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem que aparece
    // 9 - Construtor da subclasse é executado


    public static void main(String[] args) {
        Employee employee = new Employee("Junior");

    }
}
