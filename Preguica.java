package ExercicioAnimais;

public class Preguica extends AnimaisGeral{
	
	private String zoologico;

	
	Preguica (String nome, int idade,  String zoologico){
	super (nome, idade);
	this.zoologico = zoologico;
	
	}
	
	

 public String getZoologico() {
		return zoologico;
	}


	public void setZoologico(String zoologico) {
		this.zoologico = zoologico;
	}


	public void pregui () {
		
    System.out.println("O nome desta preguiça é: "+getNome()+", de idade: "+getIdade()+" anos,  pertencente ao zoológico "+zoologico);
	}
    @Override
	public void som() {

		String sonoro= "Grunhi";
		System.out.println("Este animal: "+sonoro);

	}
	@Override
	public void atitude() {
		String acao = "Anda";
		System.out.println("Este animal: "+acao);
	}
   
    
 
	 

	 
	
			
 }



