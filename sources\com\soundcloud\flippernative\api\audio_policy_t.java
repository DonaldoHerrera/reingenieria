package com.soundcloud.flippernative.api;

public class audio_policy_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected audio_policy_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(audio_policy_t audio_policy_t) {
        if (audio_policy_t == null) {
            return 0;
        }
        return audio_policy_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_audio_policy_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public audio_policy_t_value getValue() {
        return audio_policy_t_value.swigToEnum(PlayerJniJNI.audio_policy_t_value_get(this.swigCPtr, this));
    }

    public audio_policy_t_value get_value() {
        return audio_policy_t_value.swigToEnum(PlayerJniJNI.audio_policy_t_get_value(this.swigCPtr, this));
    }

    public void setValue(audio_policy_t_value audio_policy_t_value) {
        PlayerJniJNI.audio_policy_t_value_set(this.swigCPtr, this, audio_policy_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.audio_policy_t_toString(this.swigCPtr, this);
    }

    public audio_policy_t(audio_policy_t_value audio_policy_t_value) {
        this(PlayerJniJNI.new_audio_policy_t__SWIG_0(audio_policy_t_value.swigValue()), true);
    }

    public audio_policy_t() {
        this(PlayerJniJNI.new_audio_policy_t__SWIG_1(), true);
    }
}
