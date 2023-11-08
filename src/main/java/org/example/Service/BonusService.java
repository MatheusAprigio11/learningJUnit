package org.example.Service;

import org.example.Model.Aprendiz;

public class BonusService {

    public double calcularBonus(Aprendiz aprendiz){

        double valor = aprendiz.getSalario()*0.1;

        if (aprendiz.getSalario() > 1000){
            return 0.0;
        }
        return valor;



    }
}
