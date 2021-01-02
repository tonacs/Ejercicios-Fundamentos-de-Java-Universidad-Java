package tonacs.tiposprimitivos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skr
 */
public class PrimitivoBoolean {
    public static void main(String[] args) {
        System.out.println("True tipo boolean "+ Boolean.TRUE);
        System.out.println("False tipo boolean "+ Boolean.FALSE);
        
        var edad=10;
        var esAdulto=edad>=18;
        
        System.out.println("esAdulto = " + esAdulto);
       
    }
}
