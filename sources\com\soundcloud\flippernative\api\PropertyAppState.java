package com.soundcloud.flippernative.api;

public class PropertyAppState {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PropertyAppState(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PropertyAppState propertyAppState) {
        if (propertyAppState == null) {
            return 0;
        }
        return propertyAppState.swigCPtr;
    }

    public audio_performance_app_state_t const_get_value() {
        return new audio_performance_app_state_t(PlayerJniJNI.PropertyAppState_const_get_value(this.swigCPtr, this), false);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PropertyAppState(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public audio_performance_app_state_t get_value() {
        return new audio_performance_app_state_t(PlayerJniJNI.PropertyAppState_get_value(this.swigCPtr, this), false);
    }

    public boolean hasValue() {
        return PlayerJniJNI.PropertyAppState_hasValue(this.swigCPtr, this);
    }

    public void set_value(audio_performance_app_state_t audio_performance_app_state_t) {
        PlayerJniJNI.PropertyAppState_set_value(this.swigCPtr, this, audio_performance_app_state_t.getCPtr(audio_performance_app_state_t), audio_performance_app_state_t);
    }

    public PropertyAppState() {
        this(PlayerJniJNI.new_PropertyAppState(), true);
    }
}
