package com.soundcloud.flippernative.api;

public class Error {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public static class Category {
        protected transient boolean swigCMemOwn;
        private transient long swigCPtr;

        protected Category(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public static String getAUDIO_BACKEND_FAILED_TO_OPEN() {
            return PlayerJniJNI.Error_Category_AUDIO_BACKEND_FAILED_TO_OPEN_get();
        }

        protected static long getCPtr(Category category) {
            if (category == null) {
                return 0;
            }
            return category.swigCPtr;
        }

        public static String getFAILED_TO_LOAD_KEY() {
            return PlayerJniJNI.Error_Category_FAILED_TO_LOAD_KEY_get();
        }

        public static String getFAILED_TO_OPEN_DECODER() {
            return PlayerJniJNI.Error_Category_FAILED_TO_OPEN_DECODER_get();
        }

        public static String getHLS_STREAM_NETWORK() {
            return PlayerJniJNI.Error_Category_HLS_STREAM_NETWORK_get();
        }

        public static String getMP3_EXTRACTOR() {
            return PlayerJniJNI.Error_Category_MP3_EXTRACTOR_get();
        }

        public static String getOFFLINE_PLAYBACK_FAILED_TO_OPEN() {
            return PlayerJniJNI.Error_Category_OFFLINE_PLAYBACK_FAILED_TO_OPEN_get();
        }

        public static String getPLAYLIST_INCOMPLETE() {
            return PlayerJniJNI.Error_Category_PLAYLIST_INCOMPLETE_get();
        }

        public static void setAUDIO_BACKEND_FAILED_TO_OPEN(String str) {
            PlayerJniJNI.Error_Category_AUDIO_BACKEND_FAILED_TO_OPEN_set(str);
        }

        public static void setFAILED_TO_LOAD_KEY(String str) {
            PlayerJniJNI.Error_Category_FAILED_TO_LOAD_KEY_set(str);
        }

        public static void setFAILED_TO_OPEN_DECODER(String str) {
            PlayerJniJNI.Error_Category_FAILED_TO_OPEN_DECODER_set(str);
        }

        public static void setHLS_STREAM_NETWORK(String str) {
            PlayerJniJNI.Error_Category_HLS_STREAM_NETWORK_set(str);
        }

        public static void setMP3_EXTRACTOR(String str) {
            PlayerJniJNI.Error_Category_MP3_EXTRACTOR_set(str);
        }

        public static void setOFFLINE_PLAYBACK_FAILED_TO_OPEN(String str) {
            PlayerJniJNI.Error_Category_OFFLINE_PLAYBACK_FAILED_TO_OPEN_set(str);
        }

        public static void setPLAYLIST_INCOMPLETE(String str) {
            PlayerJniJNI.Error_Category_PLAYLIST_INCOMPLETE_set(str);
        }

        public synchronized void delete() {
            if (this.swigCPtr != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    PlayerJniJNI.delete_Error_Category(this.swigCPtr);
                }
                this.swigCPtr = 0;
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            delete();
        }

        public Category() {
            this(PlayerJniJNI.new_Error_Category(), true);
        }
    }

    protected Error(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(Error error) {
        if (error == null) {
            return 0;
        }
        return error.swigCPtr;
    }

    public void appendDebugInfo(String str) {
        PlayerJniJNI.Error_appendDebugInfo(this.swigCPtr, this, str);
    }

    public String category() {
        return PlayerJniJNI.Error_category(this.swigCPtr, this);
    }

    public error_code code() {
        return error_code.swigToEnum(PlayerJniJNI.Error_code(this.swigCPtr, this));
    }

    public String debugInfo() {
        return PlayerJniJNI.Error_debugInfo(this.swigCPtr, this);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_Error(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public ErrorReason errorReason() {
        return ErrorReason.swigToEnum(PlayerJniJNI.Error_errorReason(this.swigCPtr, this));
    }

    public String file() {
        return PlayerJniJNI.Error_file(this.swigCPtr, this);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public int line() {
        return PlayerJniJNI.Error_line(this.swigCPtr, this);
    }

    public void prependDebugInfo(String str) {
        PlayerJniJNI.Error_prependDebugInfo(this.swigCPtr, this, str);
    }

    public String sinkName() {
        return PlayerJniJNI.Error_sinkName(this.swigCPtr, this);
    }

    public Error(error_code error_code, ErrorReason errorReason, String str, String str2, String str3, int i, String str4) {
        this(PlayerJniJNI.new_Error__SWIG_0(error_code.swigValue(), errorReason.swigValue(), str, str2, str3, i, str4), true);
    }

    public Error(error_code error_code, ErrorReason errorReason, String str, String str2, String str3, int i) {
        this(PlayerJniJNI.new_Error__SWIG_1(error_code.swigValue(), errorReason.swigValue(), str, str2, str3, i), true);
    }

    public Error(error_code error_code, ErrorReason errorReason, String str, String str2, String str3) {
        this(PlayerJniJNI.new_Error__SWIG_2(error_code.swigValue(), errorReason.swigValue(), str, str2, str3), true);
    }

    public Error(error_code error_code, ErrorReason errorReason, String str, String str2) {
        this(PlayerJniJNI.new_Error__SWIG_3(error_code.swigValue(), errorReason.swigValue(), str, str2), true);
    }

    public Error(error_code error_code, ErrorReason errorReason, String str) {
        this(PlayerJniJNI.new_Error__SWIG_4(error_code.swigValue(), errorReason.swigValue(), str), true);
    }

    public Error(error_code error_code, ErrorReason errorReason) {
        this(PlayerJniJNI.new_Error__SWIG_5(error_code.swigValue(), errorReason.swigValue()), true);
    }

    public Error(error_code error_code) {
        this(PlayerJniJNI.new_Error__SWIG_6(error_code.swigValue()), true);
    }

    public Error() {
        this(PlayerJniJNI.new_Error__SWIG_7(), true);
    }
}
