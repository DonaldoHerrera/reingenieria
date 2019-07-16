package com.soundcloud.flippernative.api;

public class BaseAnyEvent extends serializable_event {
    private transient long swigCPtr;

    protected BaseAnyEvent(long j, boolean z) {
        super(PlayerJniJNI.BaseAnyEvent_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    protected static long getCPtr(BaseAnyEvent baseAnyEvent) {
        if (baseAnyEvent == null) {
            return 0;
        }
        return baseAnyEvent.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_BaseAnyEvent(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public String toJson() {
        return PlayerJniJNI.BaseAnyEvent_toJson(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__shared_ptrT_Events__serializable_event_t clone() {
        return new SWIGTYPE_p_std__shared_ptrT_Events__serializable_event_t(PlayerJniJNI.BaseAnyEvent_clone(this.swigCPtr, this), true);
    }

    public BaseAnyEvent() {
        this(PlayerJniJNI.new_BaseAnyEvent(), true);
    }
}
