package ExercicioAnimais;

public class Preguica extends AnimaisGeral{
	
	private String zoologico;

	
	Preguica (String nome, int idade, int ameaca,  String zoologico){
	super (nome, idade,ameaca);
	this.zoologico = zoologico;
	
	}
	
	

 public String getZoologico() {
		return zoologico;
	}


	public void setZoologico(String zoologico) {
		this.zoologico = zoologico;
	}


	public void pregui () {
		
	
    String[]  lista = new String [7];
    System.out.println("O nome desta preguiça é: "+getNome()+", de idade: "+getIdade()+" anos,  pertencente ao zoológico "+zoologico+", quando se sente ameaçada ela vai "+this.som()+ "mas ela costuma ser sempre bem ");
   
   
    
   System.out.println( lista [0]= ("D..."));
   System.out.println( lista [1]= ("E..."));
   System.out.println( lista [2]= ("V..."));
   System.out.println( lista [3]= ("A..."));
   System.out.println( lista [4]= ("G..."));
   System.out.println( lista [5]= ("A..."));
   System.out.println( lista [6]= ("R..."));
    
  
   
	}


	 
	 
	
			
 }



