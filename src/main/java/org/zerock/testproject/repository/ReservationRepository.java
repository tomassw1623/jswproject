package org.zerock.testproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zerock.testproject.domain.CustomerReservation;

@Repository
public interface ReservationRepository extends JpaRepository<CustomerReservation, Long> {

}