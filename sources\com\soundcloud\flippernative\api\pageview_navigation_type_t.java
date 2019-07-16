package com.soundcloud.flippernative.api;

public class pageview_navigation_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected pageview_navigation_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(pageview_navigation_type_t pageview_navigation_type_t) {
        if (pageview_navigation_type_t == null) {
            return 0;
        }
        return pageview_navigation_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_pageview_navigation_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public pageview_navigation_type_t_value getValue() {
        return pageview_navigation_type_t_value.swigToEnum(PlayerJniJNI.pageview_navigation_type_t_value_get(this.swigCPtr, this));
    }

    public pageview_navigation_type_t_value get_value() {
        return pageview_navigation_type_t_value.swigToEnum(PlayerJniJNI.pageview_navigation_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(pageview_navigation_type_t_value pageview_navigation_type_t_value) {
        PlayerJniJNI.pageview_navigation_type_t_value_set(this.swigCPtr, this, pageview_navigation_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.pageview_navigation_type_t_toString(this.swigCPtr, this);
    }

    public pageview_navigation_type_t(pageview_navigation_type_t_value pageview_navigation_type_t_value) {
        this(PlayerJniJNI.new_pageview_navigation_type_t__SWIG_0(pageview_navigation_type_t_value.swigValue()), true);
    }

    public pageview_navigation_type_t() {
        this(PlayerJniJNI.new_pageview_navigation_type_t__SWIG_1(), true);
    }
}
