package com.pedrodev.glist.repositories;

import com.pedrodev.glist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository < Game , Long > {
}
