public class PessoaFisica{

	private long id;
	private String nome;
	private String sobrenome;
	private String cpf;


	public PessoaFisica(long novoId, String novoNome, String novoSobrenome, String novoCpf){

		id = novoId;
		nome = novoNome;
		sobrenome = novoSobrenome;
		cpf = novoCpf;
''
	}

	public void setId(long novoId){

		id = novoId;
	}

	public long getId(){
		return id;
	}

	public void setNome(String novoNome){

		nome = novoNome;
	}

	public String getNome(){
		return nome;
	}

	public void setSobrenome(String novoSobrenome){

		sobrenome = novoSobrenome;
	}

	public String getSobrenome(){
		return sobrenome;
	}
	
	public void setCpf(String novoCpf){

		cpf = novoCpf;
	}

	public String getCpf(){
		return cpf;
	}




}