package ExercicioAnimais;

public class Cavalo extends AnimaisGeral {

	private String fazenda;
	private int celeiro;
	

	Cavalo (String nome, int idade, String fazenda, int celeiro){
		super (nome, idade);
		this.fazenda = fazenda;
		this.celeiro = celeiro;


	}


		public String getFazenda() {
			return fazenda;
		}


		public void setFazenda(String fazenda) {
			this.fazenda = fazenda;
		}


		public int getCeleiro() {
			return celeiro;
		}


		public void setCor(int Celeiro) {
			this.celeiro = celeiro;
		}

		public void imprimirCavalo() {

			System.out.println("O nome deste cavalo é: "+getNome()+", de idade: "+getIdade()+" anos, de fazenda "+fazenda+", pertencente ao celeiro de número ");

		}
		@Override
		public void som() {

			String sonoro= "Relincha";
			System.out.println("Este animal: "+sonoro);

		}
		@Override
		public void atitude() {
			
			String acao = "corre";
			System.out.println("Este animal: "+acao);
		}
}




