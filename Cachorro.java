package ExercicioAnimais;

public class Cachorro extends AnimaisGeral {
	
	private String raca;
	private String cor;
	private String atitude;
	
	Cachorro (String nome, int idade, int ameaca, String raca, String cor){
	super (nome, idade, ameaca);
	this.raca = raca;
	this.cor = cor;
	
	
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
 public void imprimirCachorro() {
	 
	 System.out.println("O nome deste cachorrinho é: "+getNome()+", de idade: "+getIdade()+" anos, de raça "+raca+", e cor "+cor+", em frente a uma ameaça ele "+this.correr()+", mas antes vai "+this.som());
			
 }

}
