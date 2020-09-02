package com.codecool.observer;

import java.util.LinkedList;
import java.util.List;

public class NewsAgency {
    private List<NewsChannel> newsChannels = new LinkedList<>();
    private String news;


    public void addChannel(NewsChannel newsChannel){
        newsChannels.add(newsChannel);
    }
    
    public void removeChannel(NewsChannel newsChannel){
        newsChannels.remove(newsChannel);
    }
    
    public void setNews(String news) {
        this.news = news;
        informChannels(news);
    }
    
    private void informChannels(String news){
        for (NewsChannel newsChannel : newsChannels) {
            newsChannel.update(news);
        }
    }
}
