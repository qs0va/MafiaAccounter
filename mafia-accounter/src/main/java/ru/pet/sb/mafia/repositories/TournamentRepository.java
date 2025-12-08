/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.pet.sb.mafia.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.pet.sb.mafia.model.Tournament;

/**
 *
 * @author qs0va_
 */
@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Long> {
    public List<Tournament> findAll();
}
