package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;

public class RemoverCliente extends Edicao {
	private List<Cliente> clientes;
	private Entrada entrada;
	
	public RemoverCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	
	@Override
	public void editar() {
		
		System.out.println("======================================");
		System.out.println("Identifique o cliente utilizando o CPF:");
		Entrada entrada = new Entrada();
		String cpf = entrada.receberTexto();

		for(int i = 0; i< clientes.size(); i++) {
			Cliente c = clientes.get(i);
			if(c.getCpf().getValor().equals(cpf)) {
				clientes.remove(c);
				break;
			}
		}
	}

}
