package com.whatdowedo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ResenaService {

    @Autowired
    private ResenaRepository resenaRepository;

    public List<Resena> obtenerTodasLasResenas() {
        return resenaRepository.findAll();
    }

    public Optional<Resena> obtenerResenaPorId(Long id) {
        return resenaRepository.findById(id);
    }

    public Resena guardarResena(Resena resena) {
        return resenaRepository.save(resena);
    }

    public void eliminarResena(Long id) {
        resenaRepository.deleteById(id);
    }
}

