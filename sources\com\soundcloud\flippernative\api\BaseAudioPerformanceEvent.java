package com.soundcloud.flippernative.api;

public class BaseAudioPerformanceEvent extends serializable_event {
    private transient long swigCPtr;

    protected BaseAudioPerformanceEvent(long j, boolean z) {
        super(PlayerJniJNI.BaseAudioPerformanceEvent_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    protected static long getCPtr(BaseAudioPerformanceEvent baseAudioPerformanceEvent) {
        if (baseAudioPerformanceEvent == null) {
            return 0;
        }
        return baseAudioPerformanceEvent.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_BaseAudioPerformanceEvent(this.swigCPtr);
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
        return PlayerJniJNI.BaseAudioPerformanceEvent_toJson(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__shared_ptrT_Events__serializable_event_t clone() {
        return new SWIGTYPE_p_std__shared_ptrT_Events__serializable_event_t(PlayerJniJNI.BaseAudioPerformanceEvent_clone(this.swigCPtr, this), true);
    }

    public BaseAudioPerformanceEvent() {
        this(PlayerJniJNI.new_BaseAudioPerformanceEvent(), true);
    }
}
