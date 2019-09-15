
import java.util.Date;

public class Compromisso {

    public Compromisso(Date data, String descricao, int tempoEst, String pioridade, String hora ){
        
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
    public int getTempoEst() {
        return tempoEst;
    }

    /**
     * @param tempoEst the tempoEst to set
     */
    public void setTempoEst(int tempoEst) {
        this.tempoEst = tempoEst;
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
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    private String descricao;
    private int tempoEst;
    private String prioridade;
    private String hora;
    
}
