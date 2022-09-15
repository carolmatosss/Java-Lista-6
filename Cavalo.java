package ExercicioAnimais;

public class Cavalo extends AnimaisGeral {
		
		private String fazenda;
		private int celeiro;
		private String atitude;
		
		Cavalo (String nome, int idade, int ameaca, String fazenda, int celeiro){
		super (nome, idade, ameaca);
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
		 
		 System.out.println("O nome deste cavalo é: "+getNome()+", de idade: "+getIdade()+" anos, de fazenda "+fazenda+", pertencente ao celeiro de número "+celeiro+", em frente a uma ameaça ele "+this.correr()+", mas antes vai "+this.som());
				
	 }

	}


