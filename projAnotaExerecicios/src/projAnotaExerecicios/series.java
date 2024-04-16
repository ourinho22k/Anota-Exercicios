package projAnotaExerecicios;
import java.time.LocalTime;




public class series {
	
	private int reps, peso, repsIfHelp;
	
	LocalTime inicio, fim;
	
	

	public LocalTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalTime inicio) {
		this.inicio = inicio;
	}

	public LocalTime getFim() {
		return fim;
	}

	public void setFim(LocalTime fim) {
		this.fim = fim;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getRepsIfHelp() {
		return repsIfHelp;
	}

	public void setRepsIfHelp(int repsIfHelp) {
		this.repsIfHelp = repsIfHelp;
	}
	
}
