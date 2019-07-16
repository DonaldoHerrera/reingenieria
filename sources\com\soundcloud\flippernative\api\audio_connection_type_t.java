package com.soundcloud.flippernative.api;

public class audio_connection_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected audio_connection_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(audio_connection_type_t audio_connection_type_t) {
        if (audio_connection_type_t == null) {
            return 0;
        }
        return audio_connection_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_audio_connection_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public audio_connection_type_t_value getValue() {
        return audio_connection_type_t_value.swigToEnum(PlayerJniJNI.audio_connection_type_t_value_get(this.swigCPtr, this));
    }

    public audio_connection_type_t_value get_value() {
        return audio_connection_type_t_value.swigToEnum(PlayerJniJNI.audio_connection_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(audio_connection_type_t_value audio_connection_type_t_value) {
        PlayerJniJNI.audio_connection_type_t_value_set(this.swigCPtr, this, audio_connection_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.audio_connection_type_t_toString(this.swigCPtr, this);
    }

    public audio_connection_type_t(audio_connection_type_t_value audio_connection_type_t_value) {
        this(PlayerJniJNI.new_audio_connection_type_t__SWIG_0(audio_connection_type_t_value.swigValue()), true);
    }

    public audio_connection_type_t() {
        this(PlayerJniJNI.new_audio_connection_type_t__SWIG_1(), true);
    }
}
