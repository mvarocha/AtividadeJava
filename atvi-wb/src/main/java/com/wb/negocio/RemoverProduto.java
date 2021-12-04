package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class RemoverProduto extends Edicao {
	private List<Produto> produtos;
	private Entrada entrada;
	
	public RemoverProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	
	@Override
	public void editar() {
		System.out.println("======================================");
		System.out.println("Identifique o produto pelo nome:");
		Entrada entrada = new Entrada();
		String nome = entrada.receberTexto();
		
		for(int i = 0; i< produtos.size(); i++) {
			Produto p = produtos.get(i);
			if(p.nome.equals(nome)) {
				produtos.remove(p);
				break;
			}
		}
	}

}
