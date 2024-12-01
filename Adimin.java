package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.util.Scanner;

	public class Adimin  extends Usuario{
		
		private Scanner scanner = new Scanner(System.in);

		public Adimin(String nome, String matricula, String email) {
			super(nome, matricula, email);
			// TODO Auto-generated constructor stub
		}

		
		public void addLivro(Estoque estoque) {
	        if (estoque == null) {
	            System.out.println("Erro: Estoque não pode ser nulo.");
	            return;
	        }
	        System.out.println("=== Cadastro de Livro ===");
	        System.out.print("Digite o título do livro: ");
	        String titulo = scanner.nextLine();

	        System.out.print("Digite o subtítulo do livro: ");
	        String subTitulo = scanner.nextLine();

	        System.out.print("Digite o autor do livro: ");
	        String autor = scanner.nextLine();

	        System.out.print("Digite a sinopse do livro: ");
	        String sinopse = scanner.nextLine();

	        System.out.print("Digite o gênero do livro: ");
	        String genero = scanner.nextLine();

	        System.out.print("Digite o ISBN do livro: ");
	        String isbn = scanner.nextLine();

	        System.out.print("Digite o número de páginas: ");
	        int numeroDePaginas = scanner.nextInt();
	        scanner.nextLine(); // Consumir o \n

	        System.out.print("Digite o ano de publicação: ");
	        int anoPublicacao = scanner.nextInt();
	        scanner.nextLine(); // Consumir o \n

	        System.out.print("Digite o sumário do livro: ");
	        String sumario = scanner.nextLine();

	        System.out.print("Digite o nome da editora: ");
	        String nomeEditora = scanner.nextLine();

	        System.out.print("O livro está disponível (true/false)? ");
	        boolean disponivel = scanner.nextBoolean();
	        scanner.nextLine();

	        Livro novoLivro = new Livro(titulo, autor, subTitulo, sinopse, genero, isbn, numeroDePaginas,
	                anoPublicacao, sumario, nomeEditora, disponivel);

	        estoque.adicionarLivroAoEstoque(novoLivro);
	        System.out.println("Livro adicionado ao estoque com sucesso!");
		}
		
		public void addJornal(Estoque estoque) {
			if (estoque == null) {
	            System.out.println("Erro: Estoque não pode ser nulo.");
	            return;
	        }
			
			System.out.println();
	        System.out.println("=== Cadastro de Jornal ===");
	        System.out.print("Digite o título do jornal: ");
	        String titulo = scanner.nextLine();

	        System.out.print("Digite o autor do jornal: ");
	        String autor = scanner.nextLine();
	        
	        System.out.print("Digite o ano de publicação do jornal: ");
	        int anoPublicacao = scanner.nextInt();
	        scanner.nextLine();
	        
	        Jornal novoJornal = new Jornal(titulo,autor,anoPublicacao);
	        
	        estoque.adicionarJornalAoEstoque(novoJornal);
	        System.out.println("Jornal adicionado ao estoque com sucesso!");
		}
		
		public void addCD(Estoque estoque) {
	        if (estoque == null) {
	            System.out.println("Erro: Estoque não pode ser nulo.");
	            return;
	        }
	        
	        System.out.println("=== Cadastro de CD ===");
	        System.out.print("Digite o título do CD: ");
	        String titulo = scanner.nextLine();
	        
	        System.out.print("Digite o artista/banda: ");
	        String autoria = scanner.nextLine();
	        
	        System.out.print("Digite o gênero musical: ");
	        String tema = scanner.nextLine();
	        
	        System.out.print("Digite o ano de lançamento: ");
	        int anoLancamento = scanner.nextInt();
	        scanner.nextLine(); // Consumir o \n
	        
	        System.out.print("Digite a duração total (em minutos): ");
	        int duracao = scanner.nextInt();
	        scanner.nextLine();
	        
	        System.out.print("Digite o formato: ");
	        String formato = scanner.nextLine();
	        scanner.nextLine();
	        
	        System.out.print("Digite o tamanho do arquivo: ");
	        int tamanhoArquivo = scanner.nextInt();
	        scanner.nextLine();
	        
	        CD novoCD = new CD(formato, tamanhoArquivo, duracao, titulo, autoria, tema);
	        estoque.adicionarCDAoEstoque(novoCD);
	        
	        System.out.println("CD adicionado ao estoque com sucesso!");
	    }

		public void addDVD(Estoque estoque) {
		    if (estoque == null) {
		        System.out.println("Erro: Estoque não pode ser nulo.");
		        return;
		    }
		    
		    System.out.println("=== Cadastro de DVD ===");
		    System.out.print("Digite o título do DVD: ");
		    String titulo = scanner.nextLine();
		    
		    System.out.print("Digite o diretor do DVD: ");
		    String autoria = scanner.nextLine();
		    
		    System.out.print("Digite o gênero do DVD: ");
		    String tema = scanner.nextLine();
		    
		    System.out.print("Digite a duração total (em minutos): ");
		    double duracao = scanner.nextDouble();
		    scanner.nextLine(); // Consumir o \n residual
		    
		    System.out.print("Digite o tamanho do arquivo (em MB): ");
		    double tamanhoArquivo = scanner.nextDouble();
		    scanner.nextLine(); // Consumir o \n residual
		    
		    System.out.print("Digite o formato do DVD: ");
		    String formato = scanner.nextLine();
		    
		    DVD novoDVD = new DVD(formato, tamanhoArquivo, duracao, titulo, autoria, tema);
		    estoque.adicionarDVDAoEstoque(novoDVD);
		    
		    System.out.println("DVD adicionado ao estoque com sucesso!");
		}

		
		 public void apagaLivro(Estoque estoque) {
		        if (estoque == null) {
		            System.out.println("Erro: Estoque não pode ser nulo.");
		            return;
		        }
		        System.out.println("=== Remover Livro ===");
		        System.out.print("Digite o título do livro a ser removido: ");
		        String titulo = scanner.nextLine();

		        if (estoque.removerLivroDoEstoque(titulo)) {
		            System.out.println("Livro removido do estoque com sucesso!");
		        } else {
		            System.out.println("Erro: Livro não encontrado.");
		        }
		    }
		 
		 public void apagaJornal(Estoque estoque) {
		        if (estoque == null) {
		            System.out.println("Erro: Estoque não pode ser nulo.");
		            return;
		        }
		        System.out.println("=== Remover Jornal ===");
		        System.out.print("Digite o título do jornal a ser removido: ");
		        String titulo = scanner.nextLine();

		        if (estoque.removerJornalDoEstoque(titulo)) {
		            System.out.println("Jornal removido do estoque com sucesso!");
		        } else {
		            System.out.println("Erro: Jornal não encontrado.");
		        }
		    }
		 
		 public void apagaCD(Estoque estoque) {
		        if (estoque == null) {
		            System.out.println("Erro: Estoque não pode ser nulo.");
		            return;
		        }
		        System.out.println("=== Remover CD ===");
		        System.out.print("Digite o nome do CD a ser removido: ");
		        String titulo = scanner.nextLine();

		        if (estoque.removerCDDoEstoque(titulo)) {
		            System.out.println("CD removido do estoque com sucesso!");
		        } else {
		            System.out.println("Erro: CD não encontrado.");
		        }
		    }
		 
		 public void apagaDVD(Estoque estoque) {
		        if (estoque == null) {
		            System.out.println("Erro: Estoque não pode ser nulo.");
		            return;
		        }
		        System.out.println("=== Remover DVD ===");
		        System.out.print("Digite o nome do DVD a ser removido: ");
		        String titulo = scanner.nextLine();

		        if (estoque.removerDVDoEstoque(titulo)) {
		            System.out.println("DVD removido do estoque com sucesso!");
		        } else {
		            System.out.println("Erro: DVD não encontrado.");
		        }
		    }
		
		
	}


