import java.util.*

fun main(args: Array<String>) {
   val input = Scanner(System.`in`)

   val salario = input.nextDouble()

   val reajuste = when {
       salario > 2000 -> 4
       salario > 1200.01 -> 7
       salario >= 800.01 -> 10
       salario >= 400.01 -> 12
       else -> 15
   }
  
  //escreva o seu código nos espaços em branco 
  
   val novoSalario = (salario * reajuste / 100) + salario 

   System.out.printf("Novo salario: %.2f\n", novoSalario)
   System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario)
   println("Em percentual: " + reajuste + " %" + "\n")
}