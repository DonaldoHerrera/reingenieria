package com.soundcloud.android.creators.record.jni;

import java.io.IOException;

public class DecoderException extends IOException {
    public DecoderException(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(VorbisConstants.getString(i));
        super(sb.toString());
    }
}
