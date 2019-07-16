package com.soundcloud.flippernative.api;

public class ad_opportunity_connection_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected ad_opportunity_connection_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(ad_opportunity_connection_type_t ad_opportunity_connection_type_t) {
        if (ad_opportunity_connection_type_t == null) {
            return 0;
        }
        return ad_opportunity_connection_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_ad_opportunity_connection_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public ad_opportunity_connection_type_t_value getValue() {
        return ad_opportunity_connection_type_t_value.swigToEnum(PlayerJniJNI.ad_opportunity_connection_type_t_value_get(this.swigCPtr, this));
    }

    public ad_opportunity_connection_type_t_value get_value() {
        return ad_opportunity_connection_type_t_value.swigToEnum(PlayerJniJNI.ad_opportunity_connection_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(ad_opportunity_connection_type_t_value ad_opportunity_connection_type_t_value) {
        PlayerJniJNI.ad_opportunity_connection_type_t_value_set(this.swigCPtr, this, ad_opportunity_connection_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.ad_opportunity_connection_type_t_toString(this.swigCPtr, this);
    }

    public ad_opportunity_connection_type_t(ad_opportunity_connection_type_t_value ad_opportunity_connection_type_t_value) {
        this(PlayerJniJNI.new_ad_opportunity_connection_type_t__SWIG_0(ad_opportunity_connection_type_t_value.swigValue()), true);
    }

    public ad_opportunity_connection_type_t() {
        this(PlayerJniJNI.new_ad_opportunity_connection_type_t__SWIG_1(), true);
    }
}
