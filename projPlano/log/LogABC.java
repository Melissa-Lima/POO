package log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogABC{

	private static LogABC logABCUnico; //Aqui temos o atributo static
	private int sequencia = 0; // Nao altere para static
	private BufferedWriter br;

	public LogABC() throws IOException {
		br = new BufferedWriter(new FileWriter("log.txt"));
	}
	
	public static LogABC getLogABCUnico() throws IOException{
		if (logABCUnico==null){
			logABCUnico = new LogABC();
		}
		return logABCUnico;
	}
	
	public void registrarAcao(String acao) {
		try {
			br.write("[" + ++sequencia + "] " + acao);
			br.newLine();
		} catch (Exception e) {
			System.out.println("Erro ao registrar acao: " + e);
		}
	}
	
	public void fecharLog() throws IOException {
		br.close();
	}	
	
}
