package com.animewatch.anime.scrapers;


import com.animewatch.anime.Quality;

import java.util.ArrayList;

public abstract class Scraper {
    public abstract ArrayList<Quality> getQualityUrls();
    public abstract  String getHost();
}
