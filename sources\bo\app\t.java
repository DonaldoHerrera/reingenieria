package bo.app;

public enum t {
    ANDROID_VERSION("os_version"),
    CARRIER("carrier"),
    MODEL("model"),
    RESOLUTION("resolution"),
    LOCALE("locale"),
    TIMEZONE("time_zone"),
    GOOGLE_ADVERTISING_ID("goodle_ad_id");
    
    private String h;

    private t(String str) {
        this.h = str;
    }

    public String a() {
        return this.h;
    }
}
