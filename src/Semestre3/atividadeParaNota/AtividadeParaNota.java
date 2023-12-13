package atividadeParaNota;
import java.util.Scanner;
import java.util.LinkedList;

public class AtividadeParaNota{
	
    public static void main(String[] args) {

        LinkedList<Candidato> todosCandidatos = new LinkedList<Candidato>();

        //Candidatos para a concorrencia
		Candidato candidato_1 = new Candidato(22, "Rodrigo");
        todosCandidatos.add(candidato_1);

        Candidato candidato_2 = new Candidato(98, "Ananias");
        todosCandidatos.add(candidato_2);

        Candidato candidato_3 = new Candidato(73, "Rosângela");
        todosCandidatos.add(candidato_3);

        Candidato candidato_4 = new Candidato(41, "Augusto");
        todosCandidatos.add(candidato_4);
        
        Candidato candidato_5 = new Candidato(28, "Joana");
        todosCandidatos.add(candidato_5);
        
        Candidato candidato_6 = new Candidato(11, "Eliana");
        todosCandidatos.add(candidato_6);

        primeiroTurno(todosCandidatos);

	}

    //Primeiro turno
    static void primeiroTurno(LinkedList<Candidato> todosCandidatos) {
        boolean eleicao = true;
        int votosNulos = 0;
        int votosGerais = 0;
        Scanner sc = new Scanner(System.in);
        
        //Eleição Primeiro Turno
        while(eleicao){

            boolean isVotoNulo = true;
            
            System.out.println("Digite o número do candidato: ");
            int voto = sc.nextInt();
            
            //================ Digite 0 para terminar a eleição ================
            if(voto == 0){

                System.out.println("A eleição terminou! Resultados:");
                vencedorPrimeiroTurno(todosCandidatos, votosGerais, votosNulos);
                sc.close();
                eleicao = false;
                break;
                
            }
            
            //Loop para verificar para quem é o voto
            for(int i = 0; i < todosCandidatos.size(); i++){


            	if(voto == todosCandidatos.get(i).getNum()){

            		System.out.println("Candidato: " + todosCandidatos.get(i).getNome() + ", Digite " + 
            		todosCandidatos.get(i).getNum() + " para confirmar o voto");
            		
            		int confirmacao = sc.nextInt();
            		
            		if (confirmacao == todosCandidatos.get(i).getNum()) {
            			
                        System.out.println("Voto contado com sucesso para " + todosCandidatos.get(i).getNome());
                        todosCandidatos.get(i).adicionarVoto();
                        isVotoNulo = false;
                        votosGerais++;
                        break;
            			
            		} else {
            			
            			System.out.println("Voto não confirmado, retornando ao menu de votação...");
            			isVotoNulo = false;
            			break;
            			
            		}
            		
                }
            	
            }

            //Computar voto nulo
            if (isVotoNulo) {
            	
            	String confirmacao_nulo = "";
                System.out.println("Numero inválido, deseja anular o voto? \n"
                		+ "(Digite 's' para Sim)");
                confirmacao_nulo = sc.next();
                
                if (confirmacao_nulo.equals("s")) {
                	
                	System.out.println("Voto anulado!");
                	votosNulos++;
                	votosGerais++;
                	
                } else {
                
                	System.out.println("Voto não anulado, voltando para o menu de votação...");
                	
                }
                              
            }

        }
        
    }
    
    //Definir o vencedor do primeiro turno  
    static void vencedorPrimeiroTurno(LinkedList<Candidato> todosCandidatos, int votosGerais, int votosNulo){
        
        for(int i = 0; i < todosCandidatos.size(); i++) {
        	
        	System.out.println("Candidato: " + todosCandidatos.get(i).getNome() + " - Votos Totais: " + todosCandidatos.get(i).getVotosTotais());
        
        }
        
        System.out.println("Votos Nulos: " + votosNulo);
        
        Candidato maisVotado = todosCandidatos.get(0);
        Candidato segundoMaisVotado = null;
        
        //Ver quem é o segundo e o primeiro mais votado
        for(int i = 1; i < todosCandidatos.size(); i++) {
        	
            if(todosCandidatos.get(i).getVotosTotais() >= maisVotado.getVotosTotais()) {
            	
            	segundoMaisVotado = maisVotado;
            	maisVotado = todosCandidatos.get(i);
            	
            } else if (segundoMaisVotado == null || todosCandidatos.get(i).getVotosTotais() > segundoMaisVotado.getVotosTotais()){
            	
            	segundoMaisVotado = todosCandidatos.get(i);
            	
            }
        	
        }
        
        //Caso não cumpra os requisitos da eleição
        if(maisVotado.getVotosTotais() <= votosGerais/2 || maisVotado.getVotosTotais() == segundoMaisVotado.getVotosTotais()) {
        	
        	System.out.println("Requisitos não atendidos, iniciando segundo turno entre: " 
        	+ maisVotado.getNome() + " e " + segundoMaisVotado.getNome());
        	segundoTurno(maisVotado, segundoMaisVotado);
        	
        } else {
        		
        	System.out.println("O vencedor da eleição é: " + maisVotado.getNome() + " com " + maisVotado.getVotosTotais() + " Votos");
        	
        }
        
    }
    
    //Segundo Turno
    static void segundoTurno(Candidato Candidato1, Candidato Candidato2) {
    	
        boolean eleicao = true;
        int votosNulos = 0;
        LinkedList<Candidato> turno2Candidatos = new LinkedList<Candidato>();
        Scanner sc = new Scanner(System.in);
        
        //Resetar os votos
        Candidato1.setNum(0);
        Candidato2.setNum(0);
        
        turno2Candidatos.add(Candidato1);
        turno2Candidatos.add(Candidato2);
        
        //Eleição Segundo Turno
        while(eleicao){

            boolean isVotoNulo = true;
            
            System.out.println("Digite o número do candidato: ");
            int voto = sc.nextInt();
            
            //================ Digite 0 para terminar a eleição ================
            if(voto == 0){

                System.out.println("A eleição terminou! Resultados:");
                vencedorSegundoTurno(turno2Candidatos, votosNulos);
                sc.close();
                eleicao = false;
                break;
                
            }
            
            //Loop para verificar para quem é o voto
            for(int i = 0; i < turno2Candidatos.size(); i++){


            	if(voto == turno2Candidatos.get(i).getNum()){

            		System.out.println("Candidato: " + turno2Candidatos.get(i).getNome() + ", Digite " + 
            				turno2Candidatos.get(i).getNum() + " para confirmar o voto");
            		
            		int confirmacao = sc.nextInt();
            		
            		//Confirmação
            		if (confirmacao == turno2Candidatos.get(i).getNum()) {
            			
                        System.out.println("Voto contado com sucesso para " + turno2Candidatos.get(i).getNome());
                        turno2Candidatos.get(i).adicionarVoto();
                        isVotoNulo = false;
                        break;
            			
            		} else {
            			
            			System.out.println("Voto não confirmado, retornando ao menu de votação...");
            			isVotoNulo = false;
            			break;
            			
            		}
            		
                }
            	
            }

            //Computar voto nulo
            if (isVotoNulo) {
            	
            	String confirmacao_nulo = "";
                System.out.println("Numero inválido, deseja anular o voto? \n"
                		+ "(Digite 's' para Sim)");
                confirmacao_nulo = sc.next();
                
                if (confirmacao_nulo.equals("s")) {
                	
                	System.out.println("Voto anulado!");
                	votosNulos++;
                	
                } else {
                
                	System.out.println("Voto não anulado, voltando para o menu de votação...");
                	
                }
                              
            }

        }
    	
    }

    //Definir o vencedor do segundo turno
    static void vencedorSegundoTurno(LinkedList<Candidato> turno2Candidatos, int votosNulos) {
    	
    	//Print dos resultados
    	for(int i = 0; i < 2; i++) {
        	
        	System.out.println("Candidato: " + turno2Candidatos.get(i).getNome() + " - Votos Totais: " + turno2Candidatos.get(i).getVotosTotais());
        
        }
        
        System.out.println("Votos Nulos: " + votosNulos);
    	
        //Definir se ouve empate ou quem é o vencedor
    	if(turno2Candidatos.get(0).getVotosTotais() == turno2Candidatos.get(1).getVotosTotais()) {
    		
    		System.out.println("Segundo turno empatado, vencedor será decidido pela Justiça Eleitoral");
    		
        } else if (turno2Candidatos.get(0).getVotosTotais() > turno2Candidatos.get(1).getVotosTotais()) {
        	
    		System.out.println("Vencedor do segundo turno é: " + turno2Candidatos.get(0).getNome() + " com " + turno2Candidatos.get(0).getVotosTotais() + " votos");
    	
        } else {
        	
    		System.out.println("Vencedor do segundo turno é: " + turno2Candidatos.get(1).getNome() + " com " + turno2Candidatos.get(1).getVotosTotais() + "votos");
    	
        }
    	
    }
    
}
