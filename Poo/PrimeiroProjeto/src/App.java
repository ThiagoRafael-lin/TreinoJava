public class App {
    
    public static void main(String[] args) throws Exception {

         // <tipoVariavel> nomeVariavel = valor;

         //Declarando um objeto do tipo Celular = instanciando um objeto
         Celular celularA = new Celular();

         celularA.nome = "Iphone 12";
         celularA.tamanhoTela = 6.1f;
         celularA.espacoArmazenamento = 256;
         celularA.sistemaOperacional = "iOS";

         System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n",  celularA.nome,  celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional );


         Celular celularB = new Celular();

         celularB.nome = "Galaxy Note 20 Ultra";
         celularB.tamanhoTela = 6.9f;
         celularB.espacoArmazenamento = 256;
         celularB.sistemaOperacional = "Android";

         System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n",  celularB.nome,  celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional );

         Celular celularC = new Celular();

         celularC.nome = "Xiaomi Mi 11 Pro";
         celularC.tamanhoTela = 6.81f;
         celularC.espacoArmazenamento = 128;
         celularC.sistemaOperacional = "Android";

         System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s",  celularC.nome,  celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional ); 
        
        }
}
