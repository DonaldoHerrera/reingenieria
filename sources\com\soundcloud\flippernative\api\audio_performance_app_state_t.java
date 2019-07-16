package com.soundcloud.flippernative.api;

public class audio_performance_app_state_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected audio_performance_app_state_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(audio_performance_app_state_t audio_performance_app_state_t) {
        if (audio_performance_app_state_t == null) {
            return 0;
        }
        return audio_performance_app_state_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_audio_performance_app_state_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public audio_performance_app_state_t_value getValue() {
        return audio_performance_app_state_t_value.swigToEnum(PlayerJniJNI.audio_performance_app_state_t_value_get(this.swigCPtr, this));
    }

    public audio_performance_app_state_t_value get_value() {
        return audio_performance_app_state_t_value.swigToEnum(PlayerJniJNI.audio_performance_app_state_t_get_value(this.swigCPtr, this));
    }

    public void setValue(audio_performance_app_state_t_value audio_performance_app_state_t_value) {
        PlayerJniJNI.audio_performance_app_state_t_value_set(this.swigCPtr, this, audio_performance_app_state_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.audio_performance_app_state_t_toString(this.swigCPtr, this);
    }

    public audio_performance_app_state_t(audio_performance_app_state_t_value audio_performance_app_state_t_value) {
        this(PlayerJniJNI.new_audio_performance_app_state_t__SWIG_0(audio_performance_app_state_t_value.swigValue()), true);
    }

    public audio_performance_app_state_t() {
        this(PlayerJniJNI.new_audio_performance_app_state_t__SWIG_1(), true);
    }
}
