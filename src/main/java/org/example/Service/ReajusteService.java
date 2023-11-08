package org.example.Service;

import org.example.Model.Aprendiz;
import org.example.Model.Desempenho;

public class ReajusteService {
    public void concederReajuste(Aprendiz aprendiz, Desempenho desempenho) {
        double aumento = desempenho.percentualReajuste()* aprendiz.getSalario();
        aprendiz.setSalario(aprendiz.getSalario()+aumento);
    }
}
