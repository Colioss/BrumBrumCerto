public class TesteCarro {
    public static void main(String[] args) {
        System.out.println("Criando e interagindo com o meu fusca");
        Carro meuFusca = new Carro();
        System.out.println("\nTentando acelerar desligado");
        meuFusca.acelerar(20);
        System.out.println("Velocidade atual do fusca"+ meuFusca.getVelocidade() +"km/h");
        System.out.println("\nAgora vamos ligar o carro...");
        meuFusca.ligar();
        meuFusca.ligar();
        System.out.println("\nAcelerando...");
        meuFusca.acelerar(15);
        meuFusca.acelerar(20);
        System.out.println("Velocidade atual "+ meuFusca.getVelocidade()+"km/h");
        System.out.println("\nFreando um pouco...");
        meuFusca.frear(10);

        System.out.println("Velocidade final: "+ meuFusca.getVelocidade()+"km/h");
    }
}
