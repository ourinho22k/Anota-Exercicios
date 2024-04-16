package projAnotaExerecicios;

import java.time.LocalDate;
import java.util.LinkedList;

public class treino {
	
	private LocalDate data;
	
	private LinkedList<exercicio> treino = new LinkedList<exercicio>();
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public LinkedList<exercicio> getTreino() {
		return treino;
	}
	public void setTreino(exercicio exerciciosExec) {
		this.treino.add(exerciciosExec);
	}
	
	
	
	
	

}
