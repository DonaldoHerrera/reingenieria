package com.soundcloud.flippernative.api;

public class CodecFrame {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected CodecFrame(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(CodecFrame codecFrame) {
        if (codecFrame == null) {
            return 0;
        }
        return codecFrame.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_CodecFrame(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public VectorChar getData() {
        long CodecFrame_data_get = PlayerJniJNI.CodecFrame_data_get(this.swigCPtr, this);
        if (CodecFrame_data_get == 0) {
            return null;
        }
        return new VectorChar(CodecFrame_data_get, false);
    }

    public long getPts() {
        return PlayerJniJNI.CodecFrame_pts_get(this.swigCPtr, this);
    }

    public void setData(VectorChar vectorChar) {
        PlayerJniJNI.CodecFrame_data_set(this.swigCPtr, this, VectorChar.getCPtr(vectorChar), vectorChar);
    }

    public void setPts(long j) {
        PlayerJniJNI.CodecFrame_pts_set(this.swigCPtr, this, j);
    }

    public CodecFrame() {
        this(PlayerJniJNI.new_CodecFrame(), true);
    }
}
