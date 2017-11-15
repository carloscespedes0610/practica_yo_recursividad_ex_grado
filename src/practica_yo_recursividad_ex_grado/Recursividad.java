/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_yo_recursividad_ex_grado;

/**
 *
 * @author cespe
 */
public final class Recursividad {
    
    public static int suma(int valor_limite){
        int suma_valor=0;
        if(valor_limite==0){
            return 0;
        }else{
            suma_valor=valor_limite+suma(valor_limite-1);
        }
        return suma_valor;
    }
    
}
