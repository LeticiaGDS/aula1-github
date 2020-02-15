package entities;

public class Quartos {
    
    private Integer id;
    private String nome;
    private Double s;

    public Quartos(Integer id, String nome, Double s) {
        this.id = id;
        this.nome = nome;
        this.s = s;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getS() {
        return s;
    }

    public void setS(Double s) {
        this.s = s;
    }

   public void increaseSalary(double percentage) {
		s += s * percentage / 100.0;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", s);
	}
    
}
