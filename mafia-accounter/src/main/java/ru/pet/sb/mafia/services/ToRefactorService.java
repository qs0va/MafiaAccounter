/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.pet.sb.mafia.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pet.sb.mafia.model.Tournament;
import ru.pet.sb.mafia.repositories.TournamentRepository;

/**
 *
 * @author qs0va_
 */
@Service
public class ToRefactorService {

    @Autowired
    TournamentRepository tournamentRepository;

    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }
}
