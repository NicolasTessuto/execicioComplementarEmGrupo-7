public class Main {
    public static void main(String[] args) {

        /*INSTANCIANDO PESSOAS APENAS COM O NOME*/
        Pessoa p0 = new Pessoa("Salvador");
        Pessoa p1 = new Pessoa("Conceição");

        Pessoa p2 = new Pessoa("Neusa");
        Pessoa p3 = new Pessoa("Eládio");

        /*INSTANCIANDO PESSOAS COM TODOS OS ATRIBUTOS*/
        Pessoa p4 = new Pessoa("Fernando",p1, p0);
        Pessoa p5 = new Pessoa("Margareth", p2, p3);
        Pessoa p6 = new Pessoa("Nícolas",p5, p4);
        Pessoa p7 = new Pessoa("Fernanda", p5, p4);
        Pessoa p8 = new Pessoa("Nícolas", p5, p4);



        p6.mesmaPessoa(p6, p8);
        p6.saoIrmao(p7,p6);

        System.out.println(p6.verificaAntecessor(p6, "Salvador"));



    }
}
