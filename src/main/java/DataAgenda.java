
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
        return 0;
    }

    public void addCompromisso(Compromisso compromisso) {
        try {
            hCompromissos.put(getData(), compromisso);
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList getCompromissosPrioridade(char proridade) {
      
        return null;
    }
}
