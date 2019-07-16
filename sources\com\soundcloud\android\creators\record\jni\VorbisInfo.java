package com.soundcloud.android.creators.record.jni;

public class VorbisInfo {
    public long bitrate;
    public int channels;
    public double duration;
    public long numSamples;
    public int sampleRate;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Info{numSamples=");
        sb.append(this.numSamples);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append('}');
        return sb.toString();
    }
}
