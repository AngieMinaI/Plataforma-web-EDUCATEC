/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


public class Notas {
    private Curso c;
    private Alumno a;
    private double exaParcial ;
    private double exaFinal;

    public Notas() {
    }

    public Notas(Curso c, Alumno a, double exaParcial, double exaFinal) {
        this.c = c;
        this.a = a;
        this.exaParcial = exaParcial;
        this.exaFinal = exaFinal;
    }
    

    public Curso getC() {
        return c;
    }

    public void setC(Curso c) {
        this.c = c;
    }

    public Alumno getA() {
        return a;
    }

    public void setA(Alumno a) {
        this.a = a;
    }

    public double getExaParcial() {
        return exaParcial;
    }

    public void setExaParcial(double exaParcial) {
        this.exaParcial = exaParcial;
    }

    public double getExaFinal() {
        return exaFinal;
    }

    public void setExaFinal(double exaFinal) {
        this.exaFinal = exaFinal;
    }
    
}
