package banco_de_dados.conexaoSQL;

public class Pessoa {

	private int pessoaId;
	private String pessoaNome;
	private int pessoaIdade;
	private int IdEndereco;
	
	public Pessoa() { }

	public Pessoa( int informedPessoaId, String informedPessoaNome, int informedPessoaIdade, int informeEndereco ) {
		this.pessoaId = informedPessoaId;
		this.pessoaNome = informedPessoaNome;
		this.pessoaIdade = informedPessoaIdade;
		this.IdEndereco = informeEndereco;
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

	public int getIdEndereco() {
		return this.IdEndereco;
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

	public void setIdEndereco( int informeEndereco ) {
		this.IdEndereco = informeEndereco;
	}
	
	// Printing pessoaal class data
	public String toString() {
		return "Nome: " + this.pessoaNome + ".\nIdade: " + this.pessoaIdade + ".\nID: " + this.pessoaId + ".\n";
	}
}
