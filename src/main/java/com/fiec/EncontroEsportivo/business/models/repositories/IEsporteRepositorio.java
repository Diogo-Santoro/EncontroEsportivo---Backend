package com.fiec.EncontroEsportivo.business.models.repositories;

import com.fiec.EncontroEsportivo.business.models.entities.Esporte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEsporteRepositorio extends JpaRepository<Esporte, String> {
    List<Esporte> findByidEsporte(String idEsporte);
}
