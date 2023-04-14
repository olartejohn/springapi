package com.edu.uniminuto.perfilespecialista;
import java.util.HashSet;

import com.edu.uniminuto.modelo.Especialista;


public interface PerfilespecialistaService {
	
	 HashSet<Especialista> findAllEspecialistas();
	 Especialista findBookByID(long id);
     void addEspecialista(Especialista b);
     void deleteAllData();

}
