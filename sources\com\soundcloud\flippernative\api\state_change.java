package com.soundcloud.flippernative.api;

public class state_change {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected state_change(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(state_change state_change) {
        if (state_change == null) {
            return 0;
        }
        return state_change.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_state_change(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public boolean getBuffering() {
        return PlayerJniJNI.state_change_buffering_get(this.swigCPtr, this);
    }

    public long getDuration() {
        return PlayerJniJNI.state_change_duration_get(this.swigCPtr, this);
    }

    public String getEffectiveUri() {
        return PlayerJniJNI.state_change_effectiveUri_get(this.swigCPtr, this);
    }

    public Error getError() {
        long state_change_error_get = PlayerJniJNI.state_change_error_get(this.swigCPtr, this);
        if (state_change_error_get == 0) {
            return null;
        }
        return new Error(state_change_error_get, false);
    }

    public MediaFormat getFormat() {
        return MediaFormat.swigToEnum(PlayerJniJNI.state_change_format_get(this.swigCPtr, this));
    }

    public long getPosition() {
        return PlayerJniJNI.state_change_position_get(this.swigCPtr, this);
    }

    public ErrorReason getReason() {
        return ErrorReason.swigToEnum(PlayerJniJNI.state_change_reason_get(this.swigCPtr, this));
    }

    public boolean getRebuffering() {
        return PlayerJniJNI.state_change_rebuffering_get(this.swigCPtr, this);
    }

    public boolean getSeekingInProgress() {
        return PlayerJniJNI.state_change_seekingInProgress_get(this.swigCPtr, this);
    }

    public PlayerState getState() {
        return PlayerState.swigToEnum(PlayerJniJNI.state_change_state_get(this.swigCPtr, this));
    }

    public StreamingProtocol getStreamingProtocol() {
        return StreamingProtocol.swigToEnum(PlayerJniJNI.state_change_streamingProtocol_get(this.swigCPtr, this));
    }

    public String getUri() {
        return PlayerJniJNI.state_change_uri_get(this.swigCPtr, this);
    }

    public void setBuffering(boolean z) {
        PlayerJniJNI.state_change_buffering_set(this.swigCPtr, this, z);
    }

    public void setDuration(long j) {
        PlayerJniJNI.state_change_duration_set(this.swigCPtr, this, j);
    }

    public void setEffectiveUri(String str) {
        PlayerJniJNI.state_change_effectiveUri_set(this.swigCPtr, this, str);
    }

    public void setError(Error error) {
        PlayerJniJNI.state_change_error_set(this.swigCPtr, this, Error.getCPtr(error), error);
    }

    public void setFormat(MediaFormat mediaFormat) {
        PlayerJniJNI.state_change_format_set(this.swigCPtr, this, mediaFormat.swigValue());
    }

    public void setPosition(long j) {
        PlayerJniJNI.state_change_position_set(this.swigCPtr, this, j);
    }

    public void setReason(ErrorReason errorReason) {
        PlayerJniJNI.state_change_reason_set(this.swigCPtr, this, errorReason.swigValue());
    }

    public void setRebuffering(boolean z) {
        PlayerJniJNI.state_change_rebuffering_set(this.swigCPtr, this, z);
    }

    public void setSeekingInProgress(boolean z) {
        PlayerJniJNI.state_change_seekingInProgress_set(this.swigCPtr, this, z);
    }

    public void setState(PlayerState playerState) {
        PlayerJniJNI.state_change_state_set(this.swigCPtr, this, playerState.swigValue());
    }

    public void setStreamingProtocol(StreamingProtocol streamingProtocol) {
        PlayerJniJNI.state_change_streamingProtocol_set(this.swigCPtr, this, streamingProtocol.swigValue());
    }

    public void setUri(String str) {
        PlayerJniJNI.state_change_uri_set(this.swigCPtr, this, str);
    }

    public state_change() {
        this(PlayerJniJNI.new_state_change(), true);
    }
}
