package com.soundcloud.flippernative.api;

public class serializable_event {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected serializable_event(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(serializable_event serializable_event) {
        if (serializable_event == null) {
            return 0;
        }
        return serializable_event.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_serializable_event(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public String toJson() {
        return PlayerJniJNI.serializable_event_toJson(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__shared_ptrT_Events__serializable_event_t clone() {
        return new SWIGTYPE_p_std__shared_ptrT_Events__serializable_event_t(PlayerJniJNI.serializable_event_clone(this.swigCPtr, this), true);
    }
}
