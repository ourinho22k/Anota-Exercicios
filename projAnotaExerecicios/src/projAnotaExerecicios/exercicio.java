package projAnotaExerecicios;

import java.time.LocalTime;
import java.util.LinkedList;

public class exercicio {
	
	
	private String nome_exercicio;
	
	private LinkedList<series> suas_series = new LinkedList<series>();
	private LocalTime pausa;
	
	
	private int quantSeries() {
		
		int num_series = this.suas_series.size();
		return num_series;
		
	}
	
		
	public int getQuaseries() {
		return this.quantSeries();
	}
	
	public String getNome_exercicio() {
		return nome_exercicio;
	}

	public void setNome_exercicio(String nome_exercicio) {
		this.nome_exercicio = nome_exercicio;
	}

	public String getSuas_series() {
		return suas_series.);
	}
	public void setSuas_series(series ser) {
		this.suas_series.add(ser);
	}
	public LocalTime getPausa() {
		return pausa;
	}
	public void setPausa(LocalTime pausa) {
		this.pausa = pausa;
	}
	
	
	
	

}
