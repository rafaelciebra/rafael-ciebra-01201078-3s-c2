package br.com.bandtec.projetojpa03.dominio;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Lutador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank //o "nome" é obrigatório sem espacos em branco
    @Size(min = 3, max = 12) // indica que o campo deve ter entre entre 10 e 50 letras
    private String nome;

    @NotNull // o campo deve ser obrigatório
    @PositiveOrZero //numero real
    private Double forcaGolpe;

    @PositiveOrZero //numero real
    private Integer vida;

    @PositiveOrZero //numero real
    private Integer concentracoesRealizadas;

    private Boolean vivo;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = 100;
    }

    public Integer getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }

    public void setConcentracoesRealizadas(Integer concentracoesRealizadas) {
        this.concentracoesRealizadas = 0;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        if(vida>0){
            this.vivo = true;
        }
        else {
            this.vivo = false;
        }

    }
}