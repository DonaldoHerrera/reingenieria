package com.soundcloud.flippernative.api;

public class MediaCodecDelegate {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected MediaCodecDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(MediaCodecDelegate mediaCodecDelegate) {
        if (mediaCodecDelegate == null) {
            return 0;
        }
        return mediaCodecDelegate.swigCPtr;
    }

    public void close() {
        PlayerJniJNI.MediaCodecDelegate_close(this.swigCPtr, this);
    }

    public VectorChar decode(VectorChar vectorChar, long j, boolean z) {
        return new VectorChar(PlayerJniJNI.MediaCodecDelegate_decode(this.swigCPtr, this, VectorChar.getCPtr(vectorChar), vectorChar, j, z), true);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_MediaCodecDelegate(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public boolean isOutputEOS() {
        return PlayerJniJNI.MediaCodecDelegate_isOutputEOS(this.swigCPtr, this);
    }

    public boolean open(String str) {
        return PlayerJniJNI.MediaCodecDelegate_open(this.swigCPtr, this, str);
    }

    public void start() {
        PlayerJniJNI.MediaCodecDelegate_start(this.swigCPtr, this);
    }

    public void stop() {
        PlayerJniJNI.MediaCodecDelegate_stop(this.swigCPtr, this);
    }

    /* access modifiers changed from: protected */
    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        PlayerJniJNI.MediaCodecDelegate_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        PlayerJniJNI.MediaCodecDelegate_change_ownership(this, this.swigCPtr, true);
    }

    public MediaCodecDelegate() {
        this(PlayerJniJNI.new_MediaCodecDelegate(), true);
        PlayerJniJNI.MediaCodecDelegate_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }
}
