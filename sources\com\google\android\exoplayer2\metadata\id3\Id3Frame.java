package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata.Entry;

public abstract class Id3Frame implements Entry {
    public final String a;

    public Id3Frame(String str) {
        this.a = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.a;
    }
}
