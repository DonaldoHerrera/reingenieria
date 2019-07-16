package com.soundcloud.flippernative.api;

public class stats_view_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected stats_view_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(stats_view_type_t stats_view_type_t) {
        if (stats_view_type_t == null) {
            return 0;
        }
        return stats_view_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_stats_view_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public stats_view_type_t_value getValue() {
        return stats_view_type_t_value.swigToEnum(PlayerJniJNI.stats_view_type_t_value_get(this.swigCPtr, this));
    }

    public stats_view_type_t_value get_value() {
        return stats_view_type_t_value.swigToEnum(PlayerJniJNI.stats_view_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(stats_view_type_t_value stats_view_type_t_value) {
        PlayerJniJNI.stats_view_type_t_value_set(this.swigCPtr, this, stats_view_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.stats_view_type_t_toString(this.swigCPtr, this);
    }

    public stats_view_type_t(stats_view_type_t_value stats_view_type_t_value) {
        this(PlayerJniJNI.new_stats_view_type_t__SWIG_0(stats_view_type_t_value.swigValue()), true);
    }

    public stats_view_type_t() {
        this(PlayerJniJNI.new_stats_view_type_t__SWIG_1(), true);
    }
}
