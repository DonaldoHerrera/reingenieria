package com.soundcloud.flippernative.api;

public class PropertyInt64 {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PropertyInt64(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PropertyInt64 propertyInt64) {
        if (propertyInt64 == null) {
            return 0;
        }
        return propertyInt64.swigCPtr;
    }

    public long const_get_value() {
        return PlayerJniJNI.PropertyInt64_const_get_value(this.swigCPtr, this);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PropertyInt64(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public SWIGTYPE_p_long_long get_value() {
        return new SWIGTYPE_p_long_long(PlayerJniJNI.PropertyInt64_get_value(this.swigCPtr, this), false);
    }

    public boolean hasValue() {
        return PlayerJniJNI.PropertyInt64_hasValue(this.swigCPtr, this);
    }

    public void set_value(long j) {
        PlayerJniJNI.PropertyInt64_set_value(this.swigCPtr, this, j);
    }

    public PropertyInt64() {
        this(PlayerJniJNI.new_PropertyInt64(), true);
    }
}
