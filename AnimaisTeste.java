package ExercicioAnimais;

import java.util.Scanner;

public class AnimaisTeste {
	public static void main(String[] args) {

		Cachorro dog1 = new Cachorro ("Jhonny",9,"shih-tzu","branco");
		Cavalo cavalo1 = new Cavalo ("Alazão",12,"Campo azul",3);
		Preguica preguica1 = new Preguica ("Maria",2,"Jabaquara");

		AnimaisGeral  animais = null;
		Scanner leia = new Scanner (System.in);
		int op, x;

		for (x=0;x<3;x++) {
			System.out.println("\n\nQual animal você deseja conhecer?");
			System.out.println("1- Cachorro");
			System.out.println("2- Cavalo");
			System.out.println("3- Preguiça");
			op = leia.nextInt();

			if (op==1) {
				dog1.imprimirCachorro();
				dog1.som();
				dog1.atitude();
			}else if (op==2) {
				cavalo1.imprimirCavalo();
				cavalo1.som();
				cavalo1.atitude();

			}else if (op==3) {
				preguica1.pregui();
				preguica1.som();
				preguica1.atitude();


			}else
				System.out.println ("Opção inválida");

		}
	}
}
