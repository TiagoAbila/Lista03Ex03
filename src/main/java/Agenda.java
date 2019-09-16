
import java.time.LocalDate;
import java.util.ArrayList;

// Alunos: Tiago Abila e Pedro Manoel
public class Agenda {
    
    private DataAgenda[] datas = new DataAgenda[31];
    private int contador = 0;
    private boolean achou = false;
    private byte indice = 0;
    

    public Compromisso getMenorCompromisso(){
        int tempo = Integer.MAX_VALUE;
        Compromisso menorCompromisso = null;
        for (DataAgenda data: datas) {
            for (Compromisso compromisso:data.gethCompromissos().values()) {
                if (compromisso.getTempo() < tempo) {
                    tempo = compromisso.getTempo();
                    menorCompromisso = compromisso;
                }
            }
        }
    
        return menorCompromisso;     
    } 
    
    public void addDataAgenda(DataAgenda dataAgenda){
        setAchou(false);
        for (DataAgenda data: datas) {
            if (!(data.getData() == data.getData())) {
                datas[contador] = dataAgenda;
                contador++;
                setAchou(true);
            }
        }
    }

    public boolean getAchou() {
        return achou;
    }

    public void setAchou(boolean achou) {
        this.achou = achou;
    }

    
     public String exibir() {
         DataAgenda a;
		String retorno = "Data: " + a.getData() 
						+ "\nCompromissos:";
		for (int i = 0; i < this.indice; i++) {
			retorno += "\n" + this.datas[i].exibir();
		}
		return retorno;
	}
    
}
