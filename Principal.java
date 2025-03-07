import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;


public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(
            new Funcionario("Maria", LocalDate.of(2000,10,18),new BigDecimal("2009.44"),"Operador"),
            new Funcionario("João", LocalDate.of(1990,05,12),new BigDecimal("2284.38"),"Operador"),
            new Funcionario("Caio", LocalDate.of(1961,05,02),new BigDecimal("9836.14"),"Coordenador"),
            new Funcionario("Miguel", LocalDate.of(1988,10,14),new BigDecimal("19119.88"),"Diretor"),
            new Funcionario("Alice", LocalDate.of(1995,01,05),new BigDecimal("2234.68"),"Recepcionista"),
            new Funcionario("Heitor", LocalDate.of(1999,11,19),new BigDecimal("1582.72"),"Operador"),
            new Funcionario("Artur", LocalDate.of(1993,03,31),new BigDecimal("4071.84"),"Contador"),
            new Funcionario("Laura", LocalDate.of(1994,07,8),new BigDecimal("3017.45"),"Gerente"),
            new Funcionario("Heloisa", LocalDate.of(2003,05,24),new BigDecimal("1606.85"),"Eletricista"),
            new Funcionario("Helena", LocalDate.of(1996,9,02),new BigDecimal("2799.93"),"Gerente")
        ));
        
        funcionarios.removeIf(f -> f.nome.equals("João"));
       
        funcionarios.forEach(System.out::println);
        
        funcionarios.forEach(f -> f.aumentoSalario(new BigDecimal("0.10")));     
        
        
        /* A partir do item 3.5 ao 3.12(agrupamento e filtragem) não consegui desenvolver na linguagem JAVA,
        por obter pouco contato com essa linguagem, no entanto busquei fazer o maximo que consegui sem ajuda
        (estou mais familiarizado com a linguagem PYTHON).
        */ 
    }
    
}
