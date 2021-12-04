package com.wb;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.CadastroServico;
import com.wb.negocio.Edicao;
import com.wb.negocio.EditarCliente;
import com.wb.negocio.EditarProduto;
import com.wb.negocio.EditarServico;
import com.wb.negocio.Listagem;
import com.wb.negocio.ListarClientesAmbosGeneros;
import com.wb.negocio.ListarClientesFemininos;
import com.wb.negocio.ListarClientesMasculinos;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosProdutos;
import com.wb.negocio.ListarTodosServicos;
import com.wb.negocio.RemoverCliente;
import com.wb.negocio.RemoverProduto;
import com.wb.negocio.RemoverServico;

public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao sistema de cadastro do Grupo World Beauty");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Editar");
			System.out.println("4 - Remover");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
			

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("======================================");
				System.out.println("Até mais!");
				break;
			case 1:
				System.out.println("======================================");
				System.out.println("O que deseja cadastrar?");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("3 - Serviço");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 0:
					break;
				case 1:
					Cadastro cadastro = new CadastroCliente(empresa.getClientes());
					cadastro.cadastrar();
					break;
				case 2:
					cadastro = new CadastroProduto(empresa.getProdutos());
					cadastro.cadastrar();
					break;
				case 3:
					cadastro = new CadastroServico(empresa.getServicos());
					cadastro.cadastrar();
					break;
				}
				break;
			case 2:
				System.out.println("======================================");
				System.out.println("O que deseja listar?");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("3 - Serviço");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 1:
					System.out.println("======================================");
					System.out.println("Qual lista de clientes deseja obter?");
					System.out.println("1 - Todos os clientes");
					System.out.println("2 - Clientes masculinos");
					System.out.println("3 - Clientes femininos");
					System.out.println("4 - Clientes listados por gênero separadamente");
					System.out.println("0 - Voltar");
					
					operacao = entrada.receberNumeroInteiro();
					
					switch(operacao) {
					case 0:
						break;
					case 1:
						Listagem listagem = new ListarTodosClientes(empresa.getClientes());
						listagem.listar();
						break;
					case 2:
						listagem = new ListarClientesMasculinos(empresa.getClientes());
						listagem.listar();
						break;
					case 3:
						listagem = new ListarClientesFemininos(empresa.getClientes());
						listagem.listar();
						break;
					case 4:
						listagem = new ListarClientesAmbosGeneros(empresa.getClientes());
						listagem.listar();
						break;
					}
					break;
				case 2:
					Listagem listagem = new ListarTodosProdutos(empresa.getProdutos());
					listagem.listar();
					break;
				case 3:
					listagem = new ListarTodosServicos(empresa.getServicos());
					listagem.listar();
					break;
				}
				break;
			case 3:
				System.out.println("======================================");
				System.out.println("O que deseja editar?");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("3 - Serviço");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 0:
					break;
				case 1:
					Edicao editar = new EditarCliente(empresa.getClientes());
					editar.editar();
					break;
				case 2:
					editar = new EditarProduto(empresa.getProdutos());
					editar.editar();
					break;
				case 3:
					editar = new EditarServico(empresa.getServicos());
					editar.editar();
					break;
				default:
					System.out.println("Operação não entendida");
				}
				break;
			case 4:
				System.out.println("======================================");
				System.out.println("O que deseja remover?");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("3 - Serviço");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 0:
					break;
				case 1:
					Edicao editar = new RemoverCliente(empresa.getClientes());
					editar.editar();
					break;
				case 2:
					editar = new RemoverProduto(empresa.getProdutos());
					editar.editar();
					break;
				case 3:
					editar = new RemoverServico(empresa.getServicos());
					editar.editar();
					break;
				}
				break;
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
}