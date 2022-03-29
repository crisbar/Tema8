/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8.utilidades;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CPIFP LOS ENLACES
 */
public class MiModelito extends DefaultTableModel{
    @Override
    public final boolean isCellEditable(int f, int col) {
        return false;
    }
    
}
