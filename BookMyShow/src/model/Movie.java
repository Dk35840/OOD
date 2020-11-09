package model;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private String name;
	private MPAARating mpaarating;
	private String director;
	private String summary;

	public void setName(String name) {
		this.name = name;
	}

	public void setMpaarating(MPAARating mpaarating) {
		this.mpaarating = mpaarating;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setShows(List<MovieShow> shows) {
		this.shows = shows;
	}

	public void setGeneres(List<Genre> generes) {
		this.generes = generes;
	}

	private List<MovieShow> shows = new ArrayList<>();

	private List<Genre> generes = new ArrayList<>();

	public Movie() {

	}

	private Movie(String name, MPAARating mpaaRating) {
		this.name = name;
		this.mpaarating = mpaaRating;
	}

	public static final class Builder {
		private String name;
		private MPAARating mpaarating;
		private String director;
		private String summary;
		private List<MovieShow> shows;
		private List<Genre> genres;

		private Builder(String name, MPAARating mpaarating) {
			this.name = name;
			this.mpaarating = mpaarating;
		}

		public static Builder newInstance(String name, MPAARating mpaarrting) {
			return new Builder(name, mpaarrting);
		}

		public Builder setDirectory(String director) {
			this.director = director;
			return this;
		}

		public Builder setSummary(String summary) {
			this.summary = summary;
			return this;
		}

		public Builder setShows(List<MovieShow> shows) {
			this.shows = shows;
			return this;
		}

		public Builder setGenres(List<Genre> genres) {
			this.genres = genres;
			return this;
		}

		public Movie build() {
			Movie m = new Movie(name,mpaarating);
			m.setDirector(director);
			m.setSummary(summary);
			m.setShows(shows);
			m.setGeneres(genres);
			return m;
		}
	}
}
