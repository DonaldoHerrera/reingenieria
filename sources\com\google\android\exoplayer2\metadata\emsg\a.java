package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: EventMessage */
class a implements Creator<EventMessage> {
    a() {
    }

    public EventMessage createFromParcel(Parcel parcel) {
        return new EventMessage(parcel);
    }

    public EventMessage[] newArray(int i) {
        return new EventMessage[i];
    }
}
