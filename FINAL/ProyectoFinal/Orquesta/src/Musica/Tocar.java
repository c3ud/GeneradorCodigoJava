package Musica;
public class Tocar {

    private boolean validar_Tocar;



	private Afinar prepara;



	public Tocar(){
	}
    public Logico getValidar_tocar(){
      return this.validar_Tocar;
    }
    public Afinar getPrepara(){
      return this.prepara;
    }
    public void setValidar_tocar(Logico value){
      this.validar_Tocar = value;
    }
    public void setPrepara(Afinar value){
      this.prepara = value;
    }

    public boolean isValidar_Tocar() {
    		if (preparar.isValidar_afinacion() == false) {
    			validar_Tocar = false;
    			System.out.println("Los instrumentos no estan afinados");
    			preparar.setValidar_afinacion(true);
    		} else if (preparar.isValidar_afinacion() == true) {
    			validar_Tocar = true;
    			System.out.println("Los instrumentos se afinaron");
    			System.out.println("");
    			System.out.println("Tocando");

    		}
    		return validar_Tocar;
    	}

}