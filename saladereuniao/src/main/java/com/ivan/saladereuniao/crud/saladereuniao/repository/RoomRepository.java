package com.ivan.saladereuniao.crud.saladereuniao.repository;

import com.ivan.saladereuniao.crud.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{


}
