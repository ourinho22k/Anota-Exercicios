package projAnotaExerecicios;

import java.time.LocalDate;

public class testador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		treino segunda = new treino();
		series seriesSample = new series();
		exercicio exercicioSample = new exercicio();
		//segunda.setData(LocalDate.now());
		//segunda.setTreino();
		
		exercicioSample.setNome_exercicio("Remada Cruvada");
		
		
		seriesSample.setPeso(12);
		seriesSample.setReps(10);
		
	
		exercicioSample.setSuas_series(seriesSample);
		
		System.out.println(exercicioSample.getNome_exercicio());
		System.out.println(exercicioSample.getQuaseries());
		System.out.println(exercicioSample.getSuas_series());
	}

}
