package com.soundcloud.flippernative.api;

public class VectorChar {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected VectorChar(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(VectorChar vectorChar) {
        if (vectorChar == null) {
            return 0;
        }
        return vectorChar.swigCPtr;
    }

    public void add(short s) {
        PlayerJniJNI.VectorChar_add(this.swigCPtr, this, s);
    }

    public long capacity() {
        return PlayerJniJNI.VectorChar_capacity(this.swigCPtr, this);
    }

    public void clear() {
        PlayerJniJNI.VectorChar_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_VectorChar(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public short get(int i) {
        return PlayerJniJNI.VectorChar_get(this.swigCPtr, this, i);
    }

    public boolean isEmpty() {
        return PlayerJniJNI.VectorChar_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        PlayerJniJNI.VectorChar_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, short s) {
        PlayerJniJNI.VectorChar_set(this.swigCPtr, this, i, s);
    }

    public long size() {
        return PlayerJniJNI.VectorChar_size(this.swigCPtr, this);
    }

    public VectorChar() {
        this(PlayerJniJNI.new_VectorChar__SWIG_0(), true);
    }

    public VectorChar(long j) {
        this(PlayerJniJNI.new_VectorChar__SWIG_1(j), true);
    }
}
