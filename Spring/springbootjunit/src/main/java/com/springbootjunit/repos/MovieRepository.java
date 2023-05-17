package com.springbootjunit.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springbootjunit.entity.Movie;
public interface MovieRepository extends JpaRepository<Movie, Long>
{
	List<Movie> findByGenera(String genera);
}


