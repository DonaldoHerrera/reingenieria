package com.soundcloud.flippernative.api;

public class MediaType {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected MediaType(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(MediaType mediaType) {
        if (mediaType == null) {
            return 0;
        }
        return mediaType.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_MediaType(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public String getMediaMimeType() {
        return PlayerJniJNI.MediaType_getMediaMimeType(this.swigCPtr, this);
    }

    public StreamingProtocol getStreamingProtocol() {
        return StreamingProtocol.swigToEnum(PlayerJniJNI.MediaType_getStreamingProtocol(this.swigCPtr, this));
    }

    public MediaType() {
        this(PlayerJniJNI.new_MediaType__SWIG_0(), true);
    }

    public MediaType(String str, StreamingProtocol streamingProtocol) {
        this(PlayerJniJNI.new_MediaType__SWIG_1(str, streamingProtocol.swigValue()), true);
    }
}
