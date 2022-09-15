package ExercicioAnimais;

public class Cachorro extends AnimaisGeral {

	private String raca;
	private String cor;
	

	Cachorro (String nome, int idade, String raca, String cor){
		super (nome, idade);
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

		System.out.println("O nome deste cachorrinho é: "+getNome()+", de idade: "+getIdade()+" anos, de raça "+raca+", e cor "+cor);

	}
	@Override
	public void som() {

		String sonoro= "Late";
		System.out.println("Este animal: "+sonoro);

	}
	@Override
	public void atitude() {
		String acao = "corre";
		System.out.println("Este animal: "+acao);
	}
}
