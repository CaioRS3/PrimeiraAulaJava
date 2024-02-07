package pjAula1;
/**
 *	@autor Caio Silva
 *	@data 06/02/2024
 *	@Classe de Modelagem Conceitual de Produto
*/

public class Produto {
	
	//Atributos
	int codigo;
	String descricao;
	float quantidade; 
	//  ==>atividades de inclusao<==
		
    //Métodos                   ==> Assinaturas <==
	public void incluir(int id, String nome, float valor) {

		
	codigo = id;
	descricao = nome;
	quantidade = valor;
	
	}
	
	public void excluir() {
		//...
	}
	
	public static void main(String[] args) {
	System.out.println("Hello World !");
	}
}
