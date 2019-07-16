package com.soundcloud.android.features.record;

import android.media.MediaPlayer;
import java.io.File;
import java.io.IOException;

/* renamed from: com.soundcloud.android.features.record.v reason: case insensitive filesystem */
/* compiled from: AudioDurationHelper */
public class C3669v {
    private MediaPlayer a;

    public int a(File file) {
        if (this.a == null) {
            this.a = new MediaPlayer();
        }
        this.a.reset();
        try {
            this.a.setDataSource(file.getAbsolutePath());
            this.a.prepare();
            return this.a.getDuration();
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
