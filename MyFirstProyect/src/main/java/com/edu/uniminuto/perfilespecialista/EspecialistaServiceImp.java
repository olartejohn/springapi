package com.edu.uniminuto.perfilespecialista;

import java.util.HashSet;

import com.edu.uniminuto.modelo.Especialista;

public class EspecialistaServiceImp implements PerfilespecialistaService {

    HashSet<Especialista> especialistaList = new HashSet<Especialista>();

	@Override
	public HashSet<Especialista> findAllEspecialistas() {
		if (especialistaList.isEmpty())
            return null;
        else
            return especialistaList;
	}

	@Override
	public Especialista findBookByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEspecialista(Especialista b) {
		especialistaList.add(b);		
	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		
	}

}
