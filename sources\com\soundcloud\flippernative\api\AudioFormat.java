package com.soundcloud.flippernative.api;

public class AudioFormat {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected AudioFormat(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(AudioFormat audioFormat) {
        if (audioFormat == null) {
            return 0;
        }
        return audioFormat.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_AudioFormat(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public CodecInfo getCodec() {
        long AudioFormat_codec_get = PlayerJniJNI.AudioFormat_codec_get(this.swigCPtr, this);
        if (AudioFormat_codec_get == 0) {
            return null;
        }
        return new CodecInfo(AudioFormat_codec_get, false);
    }

    public ContainerType getContainer() {
        return ContainerType.swigToEnum(PlayerJniJNI.AudioFormat_container_get(this.swigCPtr, this));
    }

    public int getEstimatedBitrate() {
        return PlayerJniJNI.AudioFormat_estimatedBitrate_get(this.swigCPtr, this);
    }

    public void setCodec(CodecInfo codecInfo) {
        PlayerJniJNI.AudioFormat_codec_set(this.swigCPtr, this, CodecInfo.getCPtr(codecInfo), codecInfo);
    }

    public void setContainer(ContainerType containerType) {
        PlayerJniJNI.AudioFormat_container_set(this.swigCPtr, this, containerType.swigValue());
    }

    public void setEstimatedBitrate(int i) {
        PlayerJniJNI.AudioFormat_estimatedBitrate_set(this.swigCPtr, this, i);
    }

    public AudioFormat() {
        this(PlayerJniJNI.new_AudioFormat(), true);
    }
}
