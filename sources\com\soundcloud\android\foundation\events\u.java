package com.soundcloud.android.foundation.events;

/* compiled from: MetricType.kt */
public enum u {
    DEV_APP_ON_CREATE("dev_app_on_create"),
    PLAY_QUEUE_LOAD("play_queue_load"),
    OFFLINE_SYNC("offline_sync"),
    LISTENING_HISTORY_LOAD("listening_history_load"),
    RECENTLY_PLAYED_LOAD("recently_played_load"),
    LOGIN("login"),
    LOAD_STATION("load_station"),
    PLAY_QUEUE_SHUFFLE("play_queue_shuffle"),
    LIKED_STATIONS_LOAD("liked_stations_load"),
    ACTIVITIES_LOAD("activities_load"),
    LIKED_TRACKS_FIRST_PAGE_LOAD("liked_tracks_first_page_load"),
    STREAM_REFRESH("stream_refresh"),
    STREAM_LOAD("stream_load");
    
    private final String o;

    private u(String str) {
        this.o = str;
    }

    public String toString() {
        return this.o;
    }
}
