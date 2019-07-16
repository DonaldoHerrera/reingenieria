package com.soundcloud.flippernative.api;

public class CodecInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected CodecInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(CodecInfo codecInfo) {
        if (codecInfo == null) {
            return 0;
        }
        return codecInfo.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_CodecInfo(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public Codec getCodec() {
        return Codec.swigToEnum(PlayerJniJNI.CodecInfo_codec_get(this.swigCPtr, this));
    }

    public long getSampleRate() {
        return PlayerJniJNI.CodecInfo_sampleRate_get(this.swigCPtr, this);
    }

    public void setCodec(Codec codec) {
        PlayerJniJNI.CodecInfo_codec_set(this.swigCPtr, this, codec.swigValue());
    }

    public void setSampleRate(long j) {
        PlayerJniJNI.CodecInfo_sampleRate_set(this.swigCPtr, this, j);
    }

    public CodecInfo() {
        this(PlayerJniJNI.new_CodecInfo(), true);
    }
}
