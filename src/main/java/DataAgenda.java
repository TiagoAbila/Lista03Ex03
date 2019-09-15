
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Alunos: Tiago Abila e Pedro Manoel
public class DataAgenda {

    private LocalDate data;
    private String efemeride;
    Map<LocalDate, Compromisso> hCompromissos = new HashMap<LocalDate, Compromisso>();

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEfemeride() {
        return efemeride;
    }

    public void setEfemeride(String efemeride) {
        this.efemeride = efemeride;
    }

    public int getTempoMedio() {
        int somaTempo = 0;
        for (Compromisso objCompromisso : hCompromissos.values()) {
            somaTempo+=objCompromisso.getTempoEst();
        }
        return somaTempo;
    }

    public void addCompromisso(Compromisso compromisso) {
        try {
            hCompromissos.put(getData(), compromisso);
        } catch (Exception e) {
            throw e;
        }
    }

    public int getQtdCompromissosPrioridades(char prioridade){
        int qtdPrioridades = 0;
        for (Compromisso objCompromisso: hCompromissos.values()) {
            if (objCompromisso.getPrioridade().chars().equals(prioridade)){
                qtdPrioridades++;
            }
        }
        return qtdPrioridades;
    }
    
    public ArrayList getCompromissosPrioridade(char proridade) {
        ArrayList <String> listaPrioridades = new ArrayList();
        for (Compromisso objCompromisso :hCompromissos.values()) {
            listaPrioridades.add(objCompromisso.getPrioridade());
        }
        return listaPrioridades;
    }
}
