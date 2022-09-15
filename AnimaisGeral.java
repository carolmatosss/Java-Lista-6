package ExercicioAnimais;

public abstract class AnimaisGeral {
	//Atributos
	private String nome;
	private int idade;
	//Construtor - Parâmetros
	
	
	
	public AnimaisGeral (String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

  abstract public void som();
  
  abstract public void atitude();
	  
  
 
 
}
