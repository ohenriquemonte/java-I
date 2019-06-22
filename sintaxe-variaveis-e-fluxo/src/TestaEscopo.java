
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
//		boolean acompanhado = quantidadePessoas > 1;

		boolean acompanhado = false;
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}

		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("Infelizmente, você não pode entrar!");
		}
	}
}
