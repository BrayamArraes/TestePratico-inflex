/*
Está classe contém:
.Armazenamento de nome, data de nascimento herdado da classe pessoas, salário e função do funcionário.
.Salário e data de nascimento com estilo brasileiro
.Calculo para aumento de salário e calculo para idade
 */
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
        
public class Funcionario extends Pessoas {
    private BigDecimal salario;
    private final String funcao;

    public Funcionario(String nome, LocalDate dataNascimento,BigDecimal salario,String funcao) {
        super(nome, dataNascimento);
        this.funcao = funcao;
        this.salario = salario;
    }
    
    public BigDecimal getSalario(){
        return salario;
}
    
    public void aumentoSalario(BigDecimal percentual){
        salario = salario.add(salario.multiply(percentual));
        
    }
    
    public String getFuncao(){
        return funcao;
    }
    
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    public String formatoSalario(){
        NumberFormat format = NumberFormat.getInstance(new Locale("pt","BR"));
        format.setMinimumFractionDigits(2);
        return format.format(salario);
    }
    
    @Override
    public String toString(){
        DateTimeFormatter dma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "nome: " + nome + ", Data de Nascimento: " + dataNascimento.format(dma) + 
                ", Salário: " + formatoSalario() + ", Função: " + funcao;     
    }
}
    

    

    
    
    
    


