// Alunos: Tiago Abila e Pedro Manoel
import java.time.LocalTime;
import java.util.Date;

public class Compromisso {

  
    private String descricao;
    private int tempo;
    private String prioridade;
    private LocalTime hora;
    
    public Compromisso(String descricao, int tempoEst, String prioridade, LocalTime hora ){
        setDescricao(descricao);
        setTempoEst(tempoEst);
        setPrioridade(prioridade);
        setHora(hora);
        
    }

    public Compromisso() {
       
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the tempoEst
     */
    public int getTempoEst() {
        return tempo;
    }

    /**
     * @param tempoEst the tempoEst to set
     */
    public void setTempoEst(int tempoEst) {
        this.tempo = tempoEst;
    }

    /**
     * @return the prioridade
     */
    public String getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return the hora
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
     
    
}
