package com.infy.roger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.roger.entity.FidoItem;

@Repository
public interface FidoItemRepository extends JpaRepository<FidoItem, Long> {

}
