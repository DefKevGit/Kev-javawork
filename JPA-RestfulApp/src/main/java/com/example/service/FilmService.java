package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.exception.FilmNotFoundException;
import com.example.model.Film;
import com.example.repository.FilmRepository;


@Service
public class FilmService
{
	FilmRepository filmRepo;

	public FilmService(FilmRepository filmRepo)
	{
		super();
		this.filmRepo = filmRepo;
	}
	
	public Film create(Film film)
	{
		return this.filmRepo.save(film);
	}
	
	public List<Film> readAll()
	{
		return this.filmRepo.findAll();
	}
	
	public Optional<Film> readOne(Integer id) throws FilmNotFoundException
	{
		return Optional.ofNullable(this.filmRepo.findById(id).orElseThrow(()-> new FilmNotFoundException()));
	}
	
	public Film update(Film film, Integer id)
	{
		Optional<Film> x= this.filmRepo.findById(id);
		Film foundFilm=x.get();
		foundFilm.setTitle(film.getTitle());
		foundFilm.setReleaseYear(film.getReleaseYear());
		foundFilm.setPlatform(film.getPlatform());
		foundFilm.setLanguage(film.getLanguage());
		foundFilm.setGenre(film.getGenre());
		foundFilm.setDuration(film.getDuration());
		foundFilm.setDirector(film.getDirector());
		foundFilm.setBoxOffice(film.getBoxOffice());
		this.filmRepo.save(foundFilm);
		return foundFilm;
	}
	
	public boolean delete (Integer id)
	{
		this.filmRepo.deleteById(id);
		return this.filmRepo.existsById(id);
	}
	
	public List<Film> readByTitle(String title)
	{
		return this.filmRepo.findFilmByTitle(title);
	}
	
	public List<Film> readByYear(String genre, int year)
	{
		return this.filmRepo.findFilmByYear(genre, year);
	}
	
	public List<Film> readByDirector(String director)
	{
		return this.filmRepo.findFilmByDirector(director);
	}
	
	public List<Film> readByDirBox(String director,int boxOffice)
	{
		return this.filmRepo.findFilmByDirBox(director, boxOffice);
	}
	
	
	
	
}
