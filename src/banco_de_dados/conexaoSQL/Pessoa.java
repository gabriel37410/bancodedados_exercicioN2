package banco_de_dados.conexaoSQL;

public class Pessoa {

	private int pessoaId;
	private String pessoaNome;
	private int pessoaIdade;
	
	public Pessoa() { }

	public Pessoa( int informedPessoaId, String informedPessoaNome, int informedPessoaIdade ) {
		this.pessoaId = informedPessoaId;
		this.pessoaNome = informedPessoaNome;
		this.pessoaIdade = informedPessoaIdade;
	}
	
	// Method Getters
	public int getPessoaId() {
		return this.pessoaId;
	}
	
	public String getPessoaNome() {
		return this.pessoaNome;
	}
	
	public int getPessoaIdade() {
		return this.pessoaIdade;
	}
	
	// Method Setters
	public void setPessoaId( int informedPessoaId ) {
		this.pessoaId = informedPessoaId;
	}
	
	public void setPessoaNome( String informedPessoaNome ) {
		this.pessoaNome = informedPessoaNome;
	}
	
	public void setPessoaIdade( int informedPessoaIdade ) {
		this.pessoaIdade = informedPessoaIdade;
	}
	
	// Printing pessoaal class data
	public String toString() {
		return "Nome: " + this.pessoaNome + ".\nIdade: " + this.pessoaIdade + ".\nID: " + this.pessoaId + ".\n";
	}
}
