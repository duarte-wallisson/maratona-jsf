package bean.estudante;

import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by duart on 5/1/2023.
 */
@Named
public class EstudanteRegistrarBean implements Serializable {
//    model
    private String nome = "Wallisson";
    private String sobrenome = "Duarte";
    private double n1;
    private double n2;
    private double n3 = 10;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
}
