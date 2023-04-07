package com.linuxtips.javaweekapi.service;

import com.linuxtips.javaweekapi.model.Curso;
import com.linuxtips.javaweekapi.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    private CursoRepository cursoRepository;

    public Curso criarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }
}