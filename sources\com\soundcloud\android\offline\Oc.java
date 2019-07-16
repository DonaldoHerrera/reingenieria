package com.soundcloud.android.offline;

/* compiled from: OfflineContentLocation */
public enum Oc {
    DEVICE_STORAGE("device_storage"),
    SD_CARD("sd_card");
    
    public final String d;

    private Oc(String str) {
        this.d = str;
    }

    public static Oc a(String str) {
        if (SD_CARD.d.equals(str)) {
            return SD_CARD;
        }
        return DEVICE_STORAGE;
    }
}
