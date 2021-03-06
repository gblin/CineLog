package com.ulicae.cinelog.dao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.parceler.Parcel;

/**
 * CineLog Copyright 2018 Pierre Rognon
 *
 *
 * This file is part of CineLog.
 * CineLog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CineLog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CineLog. If not, see <https://www.gnu.org/licenses/>.
 *
 */
@Parcel
@Entity
public class TmdbSerie {

    @Id
    Long serie_id;

    String poster_path;
    String overview;
    int year;
    String release_date;


    @Generated(hash = 118982129)
    public TmdbSerie(Long serie_id, String poster_path, String overview, int year, String release_date) {
        this.serie_id = serie_id;
        this.poster_path = poster_path;
        this.overview = overview;
        this.year = year;
        this.release_date = release_date;
    }

    @Generated(hash = 962756978)
    public TmdbSerie() {
    }
    

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public Long getSerie_id() {
        return this.serie_id;
    }

    public void setSerie_id(Long serie_id) {
        this.serie_id = serie_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmdbSerie tmdbKino = (TmdbSerie) o;

        if (year != tmdbKino.year) return false;
        if (serie_id != null ? !serie_id.equals(tmdbKino.serie_id) : tmdbKino.serie_id != null)
            return false;
        if (poster_path != null ? !poster_path.equals(tmdbKino.poster_path) : tmdbKino.poster_path != null)
            return false;
        if (overview != null ? !overview.equals(tmdbKino.overview) : tmdbKino.overview != null)
            return false;
        return release_date != null ? release_date.equals(tmdbKino.release_date) : tmdbKino.release_date == null;
    }

    @Override
    public int hashCode() {
        int result = serie_id != null ? serie_id.hashCode() : 0;
        result = 31 * result + (poster_path != null ? poster_path.hashCode() : 0);
        result = 31 * result + (overview != null ? overview.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (release_date != null ? release_date.hashCode() : 0);
        return result;
    }
}
