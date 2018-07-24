public class PilhaCheiaException extends Error{
  
  int erro;
  
   public PilhaCheiaException(int tamanho, Object novoItem){
     erro=0;
   }
   public PilhaCheiaException(int topo){
    erro=1;    
   }
     
@Override
public String getMessage(){
  if (erro==0){
    return("Pilha Cheia!");
  }
  else{
    return("Já esvaziou toda a pilha.");
}
