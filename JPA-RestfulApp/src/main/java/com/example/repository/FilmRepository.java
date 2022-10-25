package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer>
{
	// save()
	// FindById()
	// FindAll()
	// existById
	@Query(value = "SELECT * from Film where title=?1", nativeQuery = true)
	public List<Film> findFilmByTitle(String title);

	@Query(value = "SELECT * from Film where genre=?1 and release_year>=?2", nativeQuery = true)
	public List<Film> findFilmByYear(String genre, int year);

	@Query(value = "SELECT * from Film where director=?1", nativeQuery = true)
	public List<Film> findFilmByDirector(String director);

	@Query(value = "SELECT * from Film where director=?1 and box_office>=?2", nativeQuery = true)
	public List<Film> findFilmByDirBox(String director, int boxOffice);

}
