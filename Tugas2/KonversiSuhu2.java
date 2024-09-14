/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Nate
 */
public class KonversiSuhu2 extends KonversiSuhu {
    // Mengonversi dari Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4/9;
    }
}