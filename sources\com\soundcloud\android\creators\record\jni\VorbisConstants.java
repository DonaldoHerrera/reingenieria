package com.soundcloud.android.creators.record.jni;

public enum VorbisConstants {
    OV_FALSE(-1),
    OV_EOF(-2),
    OV_HOLE(-3),
    OV_EREAD(-128),
    OV_EFAULT(-129),
    OV_EIMPL(-130),
    OV_EINVAL(-131),
    OV_ENOTVORBIS(-132),
    OV_EBADHEADER(-133),
    OV_EVERSION(-134),
    OV_ENOTAUDIO(-135),
    OV_EBADPACKET(-136),
    OV_EBADLINK(-137),
    OV_ENOSEEK(-138);
    
    private final int code;

    private VorbisConstants(int i) {
        this.code = i;
    }

    static String getString(int i) {
        VorbisConstants[] values;
        for (VorbisConstants vorbisConstants : values()) {
            if (vorbisConstants.code == i) {
                return vorbisConstants.name();
            }
        }
        return "unknown";
    }
}
