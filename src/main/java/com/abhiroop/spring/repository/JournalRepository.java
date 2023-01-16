package com.abhiroop.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhiroop.spring.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
