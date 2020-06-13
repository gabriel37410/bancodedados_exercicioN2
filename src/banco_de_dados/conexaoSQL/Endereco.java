package banco_de_dados.conexaoSQL;

public class Endereco {

    private int enderecoId;
    private String enderecoCidade;
    private String enderecoRua;
    private int enderecoNumero;

    public Endereco() { }

	public Endereco( int informeEnderecoId, String informeEnderecoCidade, String informeEnderecoRua, int informeEnderecoNumero ) {
		this.enderecoId = informeEnderecoId;
		this.enderecoCidade = informeEnderecoCidade;
        this.enderecoRua = informeEnderecoRua;
        this.enderecoNumero = informeEnderecoNumero;
    }
    
    // Method Getters
    public int getEnderecoId() {
        return enderecoId;
    }
    public String getEnderecoCidade() {
        return enderecoCidade;
    }
    public String getEnderecoRua() {
        return enderecoRua;
    }
    public int getEnderecoNumero() {
        return enderecoNumero;
    }

	// Method Setters
    public void setEnderecoId(int enderecoId) {
        this.enderecoId = enderecoId;
    }
    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }
    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }
    public void setEnderecoNumero(int enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

	// Imprimi endereco
	public String toString() {
		return "\nCidade: " + this.enderecoCidade + ".\nRua: " + this.enderecoRua + ", " + this.enderecoNumero + ".";
    }
    
}

	
	
	
	

