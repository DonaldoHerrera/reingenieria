package com.soundcloud.flippernative.api;

public class PlayerListener {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PlayerListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PlayerListener playerListener) {
        if (playerListener == null) {
            return 0;
        }
        return playerListener.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PlayerListener(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public void onBufferingChanged(state_change state_change) {
        PlayerJniJNI.PlayerListener_onBufferingChanged(this.swigCPtr, this, state_change.getCPtr(state_change), state_change);
    }

    public void onDurationChanged(state_change state_change) {
        PlayerJniJNI.PlayerListener_onDurationChanged(this.swigCPtr, this, state_change.getCPtr(state_change), state_change);
    }

    public void onError(error_message error_message) {
        PlayerJniJNI.PlayerListener_onError(this.swigCPtr, this, error_message.getCPtr(error_message), error_message);
    }

    public void onPerformanceEvent(audio_performance audio_performance) {
        PlayerJniJNI.PlayerListener_onPerformanceEvent(this.swigCPtr, this, audio_performance.getCPtr(audio_performance), audio_performance);
    }

    public void onProgressChanged(state_change state_change) {
        PlayerJniJNI.PlayerListener_onProgressChanged(this.swigCPtr, this, state_change.getCPtr(state_change), state_change);
    }

    public void onSeekingStatusChanged(state_change state_change) {
        PlayerJniJNI.PlayerListener_onSeekingStatusChanged(this.swigCPtr, this, state_change.getCPtr(state_change), state_change);
    }

    public void onStateChanged(state_change state_change) {
        PlayerJniJNI.PlayerListener_onStateChanged(this.swigCPtr, this, state_change.getCPtr(state_change), state_change);
    }

    /* access modifiers changed from: protected */
    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        PlayerJniJNI.PlayerListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        PlayerJniJNI.PlayerListener_change_ownership(this, this.swigCPtr, true);
    }

    public PlayerListener() {
        this(PlayerJniJNI.new_PlayerListener(), true);
        PlayerJniJNI.PlayerListener_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }
}
