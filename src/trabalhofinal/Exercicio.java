/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import java.sql.Time;

/**
 *
 * @author tainass
 */
public abstract class Exercicio {

    public String nome;
    public Time tempoGasto;

    public abstract float caloriasGastasExercicio();

    public abstract void mostraExercicio();

    public void setTempoGasto(int h, int min, int seg) {
        this.setTempoGasto(new Time(h, min, seg));
    }

    public String getNome() {
        return nome;
    }

    public String getTempoGasto() {
        return tempoGasto.toString();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempoGasto(Time tempoGasto) {
        this.tempoGasto = tempoGasto;
    }
}
