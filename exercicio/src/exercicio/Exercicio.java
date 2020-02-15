package exercicio;

public class Exercicio {

    public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco();
      p1.setNumConta(1111);
      p1.setDono("Jubileu");
      p1.abrirConta("cc");
      p1.depositar(300);
      p1.fecharConta();
      p1.sacar(350);
      p1.fecharConta();
      p1.tudo();
    
}
}