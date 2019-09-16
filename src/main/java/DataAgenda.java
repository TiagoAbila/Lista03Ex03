
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Alunos: Tiago Abila e Pedro Manoel
public class DataAgenda {

    private LocalDate data;
    private String efemeride;
    private Map<LocalTime, Compromisso> hCompromissos = new HashMap<LocalTime, Compromisso>();

    public DataAgenda(LocalDate data, String efemeride){
        setData(data);
        setEfemeride(efemeride);
    }
    DataAgenda(){
        
    }
    
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
            somaTempo += objCompromisso.getTempo();
        }
        return somaTempo / hCompromissos.size();
    }

    public void addCompromisso(Compromisso compromisso) {
        try {
            hCompromissos.put(compromisso.getHora(), compromisso);
        } catch (Exception e) {
            throw e;
        }
    }

    public int getQtdCompromissosPrioridades(char prioridade) {
        int qtdPrioridades = 0;
        for (Compromisso objCompromisso : hCompromissos.values()) {
            if (objCompromisso.getPrioridade()== prioridade) {
                qtdPrioridades++;
            }
        }
        return qtdPrioridades;
    }

    public ArrayList getCompromissosPrioridade(char proridade) {
        ArrayList<String> listaPrioridades = new ArrayList();
        for (Compromisso objCompromisso : hCompromissos.values()) {
            listaPrioridades.add(""+objCompromisso.getPrioridade());
        }
        return listaPrioridades;
    }

    public Map<LocalTime, Compromisso> gethCompromissos() {
        return hCompromissos;
    }
}
