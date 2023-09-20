package lista6;

public class Animal {
	
private String nome;

private String raca;

private float comprimento;

private Integer numPatas;

private String cor;

private String ecosistema;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

public float getComprimento() {
	return comprimento;
}

public void setComprimento(float comprimento) {
	this.comprimento = comprimento;
}

public Integer getNumPatas() {
	return numPatas;
}

public void setNumPatas(Integer numPatas) {
	this.numPatas = numPatas;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getEcosistema() {
	return ecosistema;
}

public void setEcosistema(String ecosistema) {
	this.ecosistema = ecosistema;
}

public void caminha() {
System.out.println("andando");
}
}
