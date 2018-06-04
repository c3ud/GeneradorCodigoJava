package Musica;
public class Instrumentos {

	private Tocar tocando = new Tocar();



	private Afinar afinando = new Afinar();



	public Instrumentos(){
	}
    public Tocar getTocando(){
      return this.tocando;
    }
    public Afinar getAfinando(){
      return this.afinando;
    }
    public void setTocando(Tocar value){
      this.tocando = value;
    }
    public void setAfinando(Afinar value){
      this.afinando = value;
    }

}