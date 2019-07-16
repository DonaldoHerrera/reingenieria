package com.soundcloud.android.foundation.events;

/* compiled from: MetricKey */
public enum s {
    USER_LOGGED_IN("logged_in_user"),
    TIME_MILLIS("time_in_millis"),
    PLAY_QUEUE_SIZE("play_queue_size"),
    DOWNLOADED_DURATION("downloaded_duration_ms"),
    LISTENING_HISTORY_SIZE("listening_history_size"),
    RECENTLY_PLAYED_SIZE("recently_played_size"),
    LOGIN_PROVIDER("login_provider"),
    TRACKS_COUNT("tracks_count"),
    STATIONS_COUNT("stations_count");
    
    private final String k;

    private s(String str) {
        this.k = str;
    }

    public String toString() {
        return this.k;
    }
}
