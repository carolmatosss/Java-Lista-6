package ExercicioAnimais;

public class AnimaisGeral {
	//Atributos
	private String nome;
	private int idade;
	private int ameaca;
	//Construtor - Parâmetros
	
	public AnimaisGeral (String nome, int idade, int ameaca) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setAmeaca (ameaca);
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
	
  public int getAmeaca() {
		return ameaca;
	}

	public void setAmeaca(int ameaca) {
		this.ameaca = ameaca;
	}

protected String som() {
	  String somAnimal;
	  
	  switch (ameaca) {
	  case 1:
		  somAnimal = ("latir");
	  break;
	  case 2:
		  somAnimal = ("relinchar");
	  break;
	  case 3:
		  somAnimal = ("grunhir");
	  break;
	  default:
		  somAnimal = ("Inválido");
	 
	  }
	  return somAnimal;
	  
  }
  
  public String  correr () {
	  String atitude;
	  if (ameaca==1 || ameaca ==2) {
		atitude = ("corre");
	  }else {
		atitude = ("Opção inválida ao animal");
	  }
	  return atitude;
  }
  
  
}
