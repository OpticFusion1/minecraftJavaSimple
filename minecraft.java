//AUTOR: Fernando Groders
//VERSÃO: 1.0

import java.util.Scanner;

class minecraft {
    public static void main(String[] args) {
      int madeira=0;
      int pedregulho=0;
      int ferro=0;
      int ouro=0;
      int diamante=0;
      int pica=0;
      boolean jogo=true;
        
        System.out.println("COMANDOS:");
        System.out.println("");
        System.out.println("M - Minerar");
        System.out.println("C - Caçar"); //ADICIONAR
        System.out.println("L - Pegar madeira");
        System.out.println("B - Craftar"); //COMPLEMENTAR
        System.out.println("H - Comandos");
        System.out.println("F - Fechar jogo");
        System.out.println("");

        while(jogo==true){
            System.out.println("");
            System.out.print("O que você deseja fazer? (H - Comandos) ");
            Scanner entrada = new Scanner(System.in);
            char resp; 
            resp= entrada.next().charAt(0);
            resp=Character.toUpperCase(resp);
            
            switch(resp){ //SELECIONAR O CRAFT
              case 'B':
                System.out.println("O que você deseja craftar?: ");
                System.out.println("P - Picareta");
                System.out.println("E - Espada");
                System.out.println("A - Armadura");
                Scanner entrada1 = new Scanner(System.in);
                char craft; 
                 craft= entrada1.next().charAt(0);
                 craft=Character.toUpperCase(craft);
              
             switch(craft){ //SELECIONAR MATERIAL DA PICARETA
                case 'P':
                     System.out.println("O que você deseja craftar?: ");
                    System.out.println("1 - Picareta de madeira (Gasta 3 madeiras)");
                    System.out.println("2 - Picareta de pedra (Gasta 3 pedregulhos)");
                    System.out.println("3 - Picareta de ferro (Gasta 3 ferros)");
                    System.out.println("4 - Picareta de diamante (Gasta 3 diamantes)");
                    Scanner entrada2 = new Scanner(System.in);
                    char cpica; 
                    cpica= entrada2.next().charAt(0);
                 
                 switch(cpica){
                    case '1': //Craftar picareta de madeira
                        if(madeira>=3){
                        pica=1;
                        madeira=madeira-3;
                        System.out.println("Você construiu uma picareta de madeira!");}
                        break;
                   case '2':   //Craftar picareta de pedra
                        if(pedregulho>=3){
                        pica=2;
                        pedregulho=pedregulho-3;
                        System.out.println("Você construiu uma picareta de pedra!");}
                        break; 
                    case '3': //Craftar picareta de ferro
                        if(ferro>=3){
                        pica=3;
                        ferro=ferro-3;
                        System.out.println("Você construiu uma picareta de ferro!");}
                        break;
                    default:
                    System.out.println("Recursos insuficientes! Minere mais e tente novamente.");
                    break;
                 }
                 break;
                }
              
              
            case('L'): //COLETAR MADEIRA
                madeira+=1;
                System.out.println("Você coletou 1 madeira. Agora você possui: "+madeira); 
                break;
            
            case('M'): //COLETAR MINÉRIOS
                int alg=(int)(Math.random() * 20) +1; 
                if(alg>=10 && pica>=1){    
                    pedregulho+=1;
                    System.out.println("Você coletou 1 pedregulho. Agora você possui: "+pedregulho);}
                if(alg>=4 && alg<18 && pica>=2 ){    
                    ferro+=1;
                    System.out.println("Você coletou 1 ferro. Agora você possui: "+ferro);}
                if(alg>=2 && alg<4 && pica>=3){    
                    ouro+=1;
                    System.out.println("Você coletou 1 ouro. Agora você possui: "+ouro);}
                if(alg==1 && pica>=3){    
                        diamante+=1;
                        System.out.println("Você coletou 1 diamante. Agora você possui: "+diamante);
                }else{
                    System.out.println("Você não encontrou nada! Tente craftar uma picareta melhor!");}
                 break;


            case 'H': //MOSTRA OS COMANDOS
                System.out.println("");    
                System.out.println("COMANDOS:");
                System.out.println("M - Minerar");
                System.out.println("C - Caçar");
                System.out.println("L - Pegar madeira");
                System.out.println("B - Craftar");
                System.out.println("H - Comandos");
                System.out.println("F - Fechar jogo");
                break;
            
            case('F'): //SAIR DO JOGO
                jogo=false;
                System.out.println("");
                System.out.println("Obrigado por jogar!");
                break;
            
        }
        
    }
}


//ADICIONAR DIAMANTE
//ADICIONAR CRAFT PICARETA DIAMANTE
//ADICIONAR ARMADURAS
//ADICIONAR ESPADAS
//ADICIONAR MOBS
//ADICIONAR VIDA
//SISTEMA DE COMIDA


}