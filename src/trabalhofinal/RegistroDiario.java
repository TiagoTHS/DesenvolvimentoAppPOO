/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

/**
 *
 * @author Tiago
 */
public class RegistroDiario {
    private Data data;
    private Treino treino;
    private Dieta dieta;

    public RegistroDiario(Data data, Treino treino, Dieta dieta) {
        this.data = data;
        this.treino = treino;
        this.dieta = dieta;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
    
}
