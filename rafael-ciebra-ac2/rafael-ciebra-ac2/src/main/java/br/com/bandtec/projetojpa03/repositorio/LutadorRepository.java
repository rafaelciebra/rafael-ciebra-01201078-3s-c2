package br.com.bandtec.projetojpa03.repositorio;

import br.com.bandtec.projetojpa03.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LutadorRepository extends JpaRepository<Lutador,Integer> {
}
