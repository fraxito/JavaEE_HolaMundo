/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author xp
 */
@ManagedBean
@RequestScoped
public class pruebaJudia {

    private int numeroBotones = 18;

    public int getNumeroBotones() {
        return numeroBotones;
    }
    
    /**
     * Creates a new instance of pruebaJudia
     */
    public pruebaJudia() {
    }
    
}
