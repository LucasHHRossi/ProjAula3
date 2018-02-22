package br.com.proj.dados;

import java.util.List;

import br.com.proj.entidade.Moto;

public class MotoDB implements IMotoDB {
	public MotoDB() {

	}

	public boolean insert(Moto moto) {
		System.out.println("Id: " + moto.getId());
		System.out.println("Descricao: " + moto.getDescricao());
		System.out.println("Ano: " + moto.getAno());

		return true;
	}

	@Override
	public boolean update(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Moto> select() {
		// TODO Auto-generated method stub
		return null;
	}
}
