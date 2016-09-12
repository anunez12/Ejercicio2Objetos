/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SP
 */
public class Fraccionario { 
  private int numerador;private int denominador;private int entero; 
  public Fraccionario(int numerador,int denominador,int entero) throws Indeterminacion{ 
   this.numerador=numerador; 
   this.denominador=denominador;
   this.entero=entero; 
   if(denominador==0){ 
     throw new Indeterminacion(); 
   } 
   
  }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    } 
    public Fraccionario Suma(Fraccionario f2) throws Indeterminacion{ 
       int numerador,denominador,entero = 0; Fraccionario f;
       int numuno,numdos,deuno,dedos,num,dem; 
       numuno=(this.entero * this.denominador)+ this.numerador; 
       numdos=(f2.entero * f2.denominador)+ f2.numerador; 
       deuno=this.denominador; 
       dedos=f2.denominador; 
       num=(numuno * dedos) + (deuno * numdos); 
       dem=(deuno * dedos); 
       numerador=(num%dem); 
       denominador=(dem); 
       entero=(num/dem);
       f=new Fraccionario(numerador, denominador, entero); 
       return f;
    } 
    public Fraccionario Resta(Fraccionario f2) throws Indeterminacion{ 
     int numerador,denominador,entero=0;Fraccionario f; 
     int numuno,numdos,deuno,dedos,num,dem; 
     numuno=(this.entero * this.denominador)+ this.numerador; 
     numdos=(f2.entero * f2.denominador)+ f2.numerador; 
     deuno=this.denominador; 
     dedos=f2.denominador; 
     num=(numuno * dedos) - (deuno * numdos); 
     dem=(deuno * dedos); 
     numerador=(num%dem); 
     denominador=(dem);  
     entero=(num/dem);
     f=new Fraccionario(numerador, denominador, entero); 
     return f;
     
    } 
    public Fraccionario Multiplicacion(Fraccionario f2) throws Indeterminacion{ 
     int numerador,denominador,entero=0;Fraccionario f; 
     int numuno,numdos,deuno,dedos,num,dem; 
     numuno=(this.entero * this.denominador)+ this.numerador; 
     numdos=(f2.entero * f2.denominador)+ f2.numerador; 
     deuno=this.denominador; 
     dedos=f2.denominador; 
     num=(numuno * numdos); 
     dem=(deuno * dedos); 
     numerador=(num%dem); 
     denominador=(dem); 
     entero=(num/dem); 
     f=new Fraccionario(numerador, denominador, entero); 
     return f; 
     
    } 
    public Fraccionario Division(Fraccionario f2) throws Indeterminacion{ 
     int numerador,denominador,entero=0;Fraccionario f; 
     int numuno,numdos,deuno,dedos,num,dem; 
     numuno=(this.entero * this.denominador)+ this.numerador; 
     numdos=(f2.entero * f2.denominador)+ f2.numerador; 
     deuno=this.denominador; 
     dedos=f2.denominador; 
     num=(numuno * dedos); 
     dem=(deuno * numdos); 
     numerador=(num%dem);
     denominador=(dem); 
     entero=(num/dem); 
     f=new Fraccionario(numerador, denominador, entero); 
     return f;
    } 
    public Fraccionario FraccionMixta()throws Indeterminacion{ 
     int numerador,denominador,entero;Fraccionario f; 
     numerador=(this.entero * this.denominador)+ this.numerador; 
     denominador=this.denominador; 
     entero=this.entero; 
     f=new Fraccionario(numerador, denominador, entero); 
     return f;
    }
            
    
}
