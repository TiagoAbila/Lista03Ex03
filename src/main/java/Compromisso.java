// Alunos: Tiago Abila e Pedro Manoel
import java.time.LocalTime;
import java.util.Date;

public class Compromisso {

  
    private String descricao;
    private int tempo;
    private char prioridade;
    private LocalTime hora;
    

    public Compromisso(String descricao, char prioridade, LocalTime hora, int tempo) {
        setDescricao(descricao);
        setTempo(tempo);
        setPrioridade(prioridade);
        setHora(hora);
    }
    
    Compromisso() {
       
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
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempoEst to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    /**
     * @return the prioridade
     */
    public char getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(char prioridade) {
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