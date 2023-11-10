import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	//DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:1809"; // Conectar com o servidor
        ClienteRPC rpc = new ClienteRPC(urlServ);

        try (//Permite a progama solicitar valores ao usuário
        Scanner entrada = new Scanner(System.in)) {                        /// CLIENTE
            int opcao;

            do{
            //O usuário deve escolher quantas dimenssões das opções
            //escolhi este formato para segregar mais as opções ao usiario fazendo de uma forma mais dinamica
            System.out.println("\n==========================");
            System.out.println("Calculadora ATVD A2 APD"); //atvd = atividade
            System.out.println("\nQual dimensão gostaria de medir?");
            System.out.println("\n(1)-> 2 Dimensão.");
            System.out.println("(2)-> 3 Dimensão.");
            System.out.println("(0)-> Desligar Programa.");
            System.out.println("\nDigite uma opção:");

            opcao = entrada.nextInt(); //solicita um valor ao usuário para escolher a figura
            switch(opcao){
                //Como as Dimensões 2D possuem somente area, o calculo da area ocorre diretamente após a próxima seleção, diferente dos 3D
                case 1:
                System.out.println("\n==========================");
                System.out.println("Opções pra 2 Dimensão:");
                System.out.println("\n(1)-> Area do quadrado.");
                System.out.println("(2)-> Area do triangulo retangulo.");
                System.out.println("(3)-> Area do circulo.");
                System.out.println("(0)-> Sair.");
                System.out.println("\nDigite uma opção:");

                int escolha = entrada.nextInt();
                    switch (escolha) {

                        //Baseado na escolha anterior um dos casos é chamado para efetuar a conta
                        case 1:
                            System.out.println("\n==========================");
                            System.out.println("\nLado do quadrado:");
                            int lado = entrada.nextInt(); //o lado do quadrado é pedido ao usuário
                            System.out.println("\nA area do quadrado é: " + rpc.AreaQuadrado(lado)); //o rpc chama o ClienteRPC, que por sua vez vai buscar no servidor o calculo
                            break;
                        
                        case 2:
                            //No caso do triangulo o calculo é feito usando 2 valores, portanto são pedidos a base e a altura do triangulo para o calculo
                            System.out.println("\nBase do triangulo:");
                            int base = entrada.nextInt();
                            System.out.println("Altura do triangulo:");
                            int altura = entrada.nextInt();
                            /*As respostas finais são todas baseadas no que foi visto em sala,
                            ou seja, todas funcionam da mesma forma, mundando apenas o valor que recebem*/
                            System.out.println("\nA area do triangulo é: " + rpc.AreaTriangulo(base,altura)); 
                            break;

                        case 3:
                            //Mesma estrutura do quadrado mudando o lado pelo raio do circulo
                            System.out.println("\nRaio do circulo:");
                            int raio = entrada.nextInt();
                            System.out.println("\nA area do circulo é: " + rpc.AreaCircunferencia(raio));
                            break;
                    
                        case 0:
                            //Caso digite 0 o programa se encerra
                            break;
                        
                        default: 
                        //Mensagem padrão quando o número digitado é inválido, retorna o programa para o menu inicial
                            System.out.println("==========================");
                            System.out.println("\nValor inválido! Reiniciando Prorama...\n");
                            System.out.println("==========================\n");
                            break;
                    }
                break;

                case 2:
                //No caso das Dimensãoes 3D é escolhido apenas qual a figura se deseja calcular
                System.out.println("\n==========================");
                System.out.println("Opções pra 3 Dimensão:");
                System.out.println("\n(1)-> Cilindro.");
                System.out.println("(2)-> Esfera.");
                System.out.println("(3)-> Cubo.");
                System.out.println("(0)-> Sair.");
                System.out.println("\nDigite uma opção:");

                escolha = entrada.nextInt();
                    switch (escolha) {
                        case 1:
                            //Após a escolha outro menu aparece e pede o calculo desejado
                            System.out.println("\n==========================");
                            System.out.println("\nOpções de calculos pra cilindros:");
                            System.out.println("(1)-> volume.");
                            System.out.println("(2)-> area.");
                            System.out.println("(3)-> ambos."); //para todos os objetos 3D existe esta opção caso se queira saber a area e o volume simultaneamente
                            System.out.println("(0)-> sair.");
                            System.out.println("\nDigite uma opção:");

                            int x = entrada.nextInt();
                                switch (x) {
                                    case 1:
                                        //Na escolha de 1 ele calcula o volume
                                        //No caso do cilindro ele necessita de 2 valores que são requiridos na sequencia
                                        System.out.println("\nDigite o raio do cilindro:");
                                        int raio = entrada.nextInt();
                                        System.out.println("Digite a altura do cilindro:");
                                        int altura = entrada.nextInt();
                                        System.out.println("\nO volume do cilindro é: " + rpc.VolumeCilindro(raio,altura));
                                        break;

                                    case 2:
                                        //Na escolha de 2 ele calcula a area
                                        System.out.println("\nDigite o raio do cilindro:");
                                        raio = entrada.nextInt();
                                        System.out.println("Digite a altura do cilindro:");
                                        altura = entrada.nextInt();
                                        System.out.println("\nA area do cilindro é: " + rpc.AreaCilindro(raio,altura));
                                        break;

                                    case 3:
                                        //Na escolha de 3 ele pede o raio e a altura para calcular tanto a area quanto o volume
                                        System.out.println("\nDigite o raio do cilindro:");
                                        raio = entrada.nextInt();
                                        System.out.println("Digite a altura do cilindro:");
                                        altura = entrada.nextInt();
                                        System.out.println("\nA area do cilindro é: " + rpc.AreaCilindro(raio,altura));
                                        System.out.println("\nO volume do cilindro é: " + rpc.VolumeCilindro(raio,altura));
                                        break;
                                
                                    case 0:
                                        break;

                                    default:
                                        System.out.println("==========================");
                                        System.out.println("\nValor inválido! Reiniciando...\n");
                                        System.out.println("==========================\n");
                                        break;
                                    }
                                break;
                        
                        case 2:
                            //Estrutura identica a do cilindro com as adaptações necessárias para o calculo da esfera
                            System.out.println("\n==========================");
                            System.out.println("\nOpções de calculos pra esferas:");
                            System.out.println("(1)-> volume.");
                            System.out.println("(2)-> area.");
                            System.out.println("(3)-> ambos.");
                            System.out.println("(0)-> sair.");
                            System.out.println("\nDigite uma opção:");

                            x = entrada.nextInt();
                                switch (x) {
                                        case 1:
                                            System.out.println("\nDigite o raio da esfera:");
                                            int raio = entrada.nextInt();
                                            System.out.println("\nO volume da esfera é: " + rpc.VolumeEsfera(raio));
                                            break;

                                        case 2:
                                            System.out.println("\nDigite o raio da esfera:");
                                            raio = entrada.nextInt();
                                            System.out.println("\nA area da esfera é: " + rpc.AreaEsfera(raio));
                                            break;

                                        case 3:
                                            System.out.println("\nDigite o raio da esfera:");
                                            raio = entrada.nextInt();
                                            System.out.println("\nA area da esfera é: " + rpc.AreaEsfera(raio));
                                            System.out.println("\nO volume da esfera é: " + rpc.VolumeEsfera(raio));
                                            break;
                                    
                                        case 0:
                                            break;

                                        default:
                                            System.out.println("==========================");
                                            System.out.println("\nValor inválido! Reiniciando...\n");
                                            System.out.println("==========================\n");
                                            break;
                                    }
                                break;
                            

                        case 3:
                            //A mesma estrutura novamente e com os valores necessários para o cubo
                            System.out.println("\n==========================");
                            System.out.println("\nOpções de calculo do cubo:");
                            System.out.println("(1)-> volume.");
                            System.out.println("(2)-> area.");
                            System.out.println("(3)-> ambos.");
                            System.out.println("(0)-> sair.");
                            System.out.println("\nDigite uma opção:");

                            x = entrada.nextInt();
                                switch (x) {
                                        case 1:
                                            System.out.println("\nDigite o lado do cubo:");
                                            int lado = entrada.nextInt();
                                            System.out.println("\nO volume do cubo é: " + rpc.VolumeCubo(lado));
                                            break;

                                        case 2:
                                            System.out.println("\nDigite o lado do cubo:");
                                            lado = entrada.nextInt();
                                            System.out.println("\nA area do cubo é: " + rpc.AreaCubo(lado));
                                            break;

                                        case 3:
                                            System.out.println("\nDigite o lado do cubo:");
                                            lado = entrada.nextInt();
                                            System.out.println("\nA area do cubo é: " + rpc.AreaCubo(lado));
                                            System.out.println("\nO volume do cubo é: " + rpc.VolumeCubo(lado));
                                            break;
                                    
                                        case 0:
                                            break;

                                        default:
                                            System.out.println("==========================");
                                            System.out.println("\nValor inválido! Reiniciando...\n");
                                            System.out.println("==========================\n");
                                            break;
                                    }
                                break;
                        }
                    break;
                    case 0:
                        //Sai do loop do menu e encerra o programa
                        System.out.println("\n\n==========================");
                        System.out.println("Desligando Programa...");
                        System.out.println("==========================");
                        break;

                    default:
                        System.out.println("==========================");
                        System.out.println("\nValor inválido! Reiniciando...\n");
                        System.out.println("==========================\n");
                        break;
                }
            }while(opcao != 0);
        }
        //Confirmação ao usuario que o programa chegou ao fim e não esta mais funcionado
    System.out.println("\n\n===========================");
    System.out.println("O aplicativo calculadora foi desligado!");
    System.out.println("===========================");
    }
}