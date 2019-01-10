import estrutura.*;

public class Navios{

	

	private PilhaAprimorada pilhaDeVikings = new PilhaAprimorada(20);
	
	public String AdicionarViking(Viking viking){
			if (viking instanceof Timoneiro){
				if ( pilhaDeVikings[0]==null){
					pilhaDeVikings[0]=viking;
					return (
					("" + viking.getPosicao() + viking.tipoViking() + "ARRGH!");
				}
			}
			
			else if (viking instanceof Remador){
				for(int i==1; i<19; i++){
					if (pilhaDeVikings[i]==null){
						pilhaDeVikings[i]=viking;
						("" + viking.getPosicao() + viking.tipoViking() + "ARRGH!");
					}
				}
			}
			
			else if (viking instanceof Lider){
				if (pilhaDeVikings[19]==null{
					pilhaDeVikings[19] = viking;
					("" + viking.getPosicao() + viking.tipoViking() + "ARRGH!");
				}
			}
			
			else{
				return ("ESSE TIPO DE VIKING NAO PODE ENTRAR NO NAVIO!");
			}
		}
	}
	
	public Viking removeViking(){	
			pilhaDeVikings.desempilha();
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 
