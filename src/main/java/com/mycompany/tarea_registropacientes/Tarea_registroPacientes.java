package com.mycompany.tarea_registropacientes;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import ventanas.login;

/**
 *
 * @author 1214k
 */
public class Tarea_registroPacientes {

    public static void main(String[] args) {
        System.out.println("Empezando la tarea de registro pacientes");
        FlatCarbonIJTheme.setup();
        login loggearse = new login();
        loggearse.setVisible(true);
        
        
    }
}
