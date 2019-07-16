package com.soundcloud.flippernative.api;

public class PropertyPreloaded {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PropertyPreloaded(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PropertyPreloaded propertyPreloaded) {
        if (propertyPreloaded == null) {
            return 0;
        }
        return propertyPreloaded.swigCPtr;
    }

    public audio_performance_preloaded_t const_get_value() {
        return new audio_performance_preloaded_t(PlayerJniJNI.PropertyPreloaded_const_get_value(this.swigCPtr, this), false);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PropertyPreloaded(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public audio_performance_preloaded_t get_value() {
        return new audio_performance_preloaded_t(PlayerJniJNI.PropertyPreloaded_get_value(this.swigCPtr, this), false);
    }

    public boolean hasValue() {
        return PlayerJniJNI.PropertyPreloaded_hasValue(this.swigCPtr, this);
    }

    public void set_value(audio_performance_preloaded_t audio_performance_preloaded_t) {
        PlayerJniJNI.PropertyPreloaded_set_value(this.swigCPtr, this, audio_performance_preloaded_t.getCPtr(audio_performance_preloaded_t), audio_performance_preloaded_t);
    }

    public PropertyPreloaded() {
        this(PlayerJniJNI.new_PropertyPreloaded(), true);
    }
}
