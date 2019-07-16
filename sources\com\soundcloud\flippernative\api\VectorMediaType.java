package com.soundcloud.flippernative.api;

public class VectorMediaType {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected VectorMediaType(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(VectorMediaType vectorMediaType) {
        if (vectorMediaType == null) {
            return 0;
        }
        return vectorMediaType.swigCPtr;
    }

    public void add(MediaType mediaType) {
        PlayerJniJNI.VectorMediaType_add(this.swigCPtr, this, MediaType.getCPtr(mediaType), mediaType);
    }

    public long capacity() {
        return PlayerJniJNI.VectorMediaType_capacity(this.swigCPtr, this);
    }

    public void clear() {
        PlayerJniJNI.VectorMediaType_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_VectorMediaType(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public MediaType get(int i) {
        return new MediaType(PlayerJniJNI.VectorMediaType_get(this.swigCPtr, this, i), false);
    }

    public boolean isEmpty() {
        return PlayerJniJNI.VectorMediaType_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        PlayerJniJNI.VectorMediaType_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, MediaType mediaType) {
        PlayerJniJNI.VectorMediaType_set(this.swigCPtr, this, i, MediaType.getCPtr(mediaType), mediaType);
    }

    public long size() {
        return PlayerJniJNI.VectorMediaType_size(this.swigCPtr, this);
    }

    public VectorMediaType() {
        this(PlayerJniJNI.new_VectorMediaType__SWIG_0(), true);
    }

    public VectorMediaType(long j) {
        this(PlayerJniJNI.new_VectorMediaType__SWIG_1(j), true);
    }
}
