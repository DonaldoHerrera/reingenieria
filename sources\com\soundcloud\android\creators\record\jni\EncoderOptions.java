package com.soundcloud.android.creators.record.jni;

import com.soundcloud.android.features.record.PlaybackFilter;

public class EncoderOptions {
    public static final EncoderOptions DEFAULT = MED_Q;
    public static final EncoderOptions MED_Q;
    public final long end;
    public final PlaybackFilter filter;
    public final ProgressListener listener;
    public final float quality;
    public final long start;

    static {
        EncoderOptions encoderOptions = new EncoderOptions(0.5f, 0, -1, null, null);
        MED_Q = encoderOptions;
    }

    public EncoderOptions(float f, long j, long j2, ProgressListener progressListener, PlaybackFilter playbackFilter) {
        if (f < 0.0f || f > 1.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid quality: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (j < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("invalid start: ");
            sb2.append(j);
            throw new IllegalArgumentException(sb2.toString());
        } else if (j2 >= -1) {
            this.start = j;
            this.end = j2;
            this.filter = playbackFilter;
            this.quality = f;
            this.listener = progressListener;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("invalid end: ");
            sb3.append(j2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncoderOptions{start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", quality=");
        sb.append(this.quality);
        sb.append(", filter=");
        sb.append(this.filter);
        sb.append(", listener=");
        sb.append(this.listener);
        sb.append('}');
        return sb.toString();
    }
}
