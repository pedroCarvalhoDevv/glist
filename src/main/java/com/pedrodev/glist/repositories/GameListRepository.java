package com.pedrodev.glist.repositories;

import com.pedrodev.glist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
