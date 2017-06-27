package ru.artemaa.topjavagraduate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.artemaa.topjavagraduate.model.Vote;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Artem Areshko
 * 24.04.2017
 */
@Repository
@Transactional(readOnly = true)
public interface VoteDao extends JpaRepository<Vote, Integer> {

    @Override
    @Transactional
    Vote save(Vote vote);

    List<Vote> findByUserId(int userId);

    List<Vote> findByRestaurantIdAndDate(int restaurantId, LocalDate date);

    Vote findByUserIdAndDate(int userId, LocalDate date);

    Vote findByUserIdAndRestaurantIdAndDate(int userId, int restaurantId, LocalDate date);

}
