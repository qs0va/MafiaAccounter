/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.pet.sb.mafia.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pet.sb.mafia.model.Tournament;
import ru.pet.sb.mafia.repositories.TournamentRepository;
import ru.pet.sb.mafia.services.ToRefactorService;

/**
 *
 * @author qs0va_
 */
@RestController
@RequestMapping("test")
public class ToRefactorController {

    @Autowired
    ToRefactorService toRefactorService;

    @GetMapping("tournaments")
    List<Tournament> allTournaments() {
        return toRefactorService.getAllTournaments();
    }
}
