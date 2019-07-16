package com.soundcloud.flippernative.api;

public class rich_media_stream_error_connection_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected rich_media_stream_error_connection_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(rich_media_stream_error_connection_type_t rich_media_stream_error_connection_type_t) {
        if (rich_media_stream_error_connection_type_t == null) {
            return 0;
        }
        return rich_media_stream_error_connection_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_rich_media_stream_error_connection_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public rich_media_stream_error_connection_type_t_value getValue() {
        return rich_media_stream_error_connection_type_t_value.swigToEnum(PlayerJniJNI.rich_media_stream_error_connection_type_t_value_get(this.swigCPtr, this));
    }

    public rich_media_stream_error_connection_type_t_value get_value() {
        return rich_media_stream_error_connection_type_t_value.swigToEnum(PlayerJniJNI.rich_media_stream_error_connection_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(rich_media_stream_error_connection_type_t_value rich_media_stream_error_connection_type_t_value) {
        PlayerJniJNI.rich_media_stream_error_connection_type_t_value_set(this.swigCPtr, this, rich_media_stream_error_connection_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.rich_media_stream_error_connection_type_t_toString(this.swigCPtr, this);
    }

    public rich_media_stream_error_connection_type_t(rich_media_stream_error_connection_type_t_value rich_media_stream_error_connection_type_t_value) {
        this(PlayerJniJNI.new_rich_media_stream_error_connection_type_t__SWIG_0(rich_media_stream_error_connection_type_t_value.swigValue()), true);
    }

    public rich_media_stream_error_connection_type_t() {
        this(PlayerJniJNI.new_rich_media_stream_error_connection_type_t__SWIG_1(), true);
    }
}
