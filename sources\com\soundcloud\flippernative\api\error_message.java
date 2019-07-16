package com.soundcloud.flippernative.api;

public class error_message {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected error_message(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(error_message error_message) {
        if (error_message == null) {
            return 0;
        }
        return error_message.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_error_message(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public int getBitRate() {
        return PlayerJniJNI.error_message_bitRate_get(this.swigCPtr, this);
    }

    public String getCategory() {
        return PlayerJniJNI.error_message_category_get(this.swigCPtr, this);
    }

    public String getCdn() {
        return PlayerJniJNI.error_message_cdn_get(this.swigCPtr, this);
    }

    public String getErrorMessage() {
        return PlayerJniJNI.error_message_errorMessage_get(this.swigCPtr, this);
    }

    public String getFormat() {
        return PlayerJniJNI.error_message_format_get(this.swigCPtr, this);
    }

    public int getLine() {
        return PlayerJniJNI.error_message_line_get(this.swigCPtr, this);
    }

    public String getPlayerVariant() {
        return PlayerJniJNI.error_message_playerVariant_get(this.swigCPtr, this);
    }

    public String getSourceFile() {
        return PlayerJniJNI.error_message_sourceFile_get(this.swigCPtr, this);
    }

    public StreamingProtocol getStreamingProtocol() {
        return StreamingProtocol.swigToEnum(PlayerJniJNI.error_message_streamingProtocol_get(this.swigCPtr, this));
    }

    public String getUri() {
        return PlayerJniJNI.error_message_uri_get(this.swigCPtr, this);
    }

    public void setBitRate(int i) {
        PlayerJniJNI.error_message_bitRate_set(this.swigCPtr, this, i);
    }

    public void setCategory(String str) {
        PlayerJniJNI.error_message_category_set(this.swigCPtr, this, str);
    }

    public void setCdn(String str) {
        PlayerJniJNI.error_message_cdn_set(this.swigCPtr, this, str);
    }

    public void setErrorMessage(String str) {
        PlayerJniJNI.error_message_errorMessage_set(this.swigCPtr, this, str);
    }

    public void setFormat(String str) {
        PlayerJniJNI.error_message_format_set(this.swigCPtr, this, str);
    }

    public void setLine(int i) {
        PlayerJniJNI.error_message_line_set(this.swigCPtr, this, i);
    }

    public void setPlayerVariant(String str) {
        PlayerJniJNI.error_message_playerVariant_set(this.swigCPtr, this, str);
    }

    public void setSourceFile(String str) {
        PlayerJniJNI.error_message_sourceFile_set(this.swigCPtr, this, str);
    }

    public void setStreamingProtocol(StreamingProtocol streamingProtocol) {
        PlayerJniJNI.error_message_streamingProtocol_set(this.swigCPtr, this, streamingProtocol.swigValue());
    }

    public void setUri(String str) {
        PlayerJniJNI.error_message_uri_set(this.swigCPtr, this, str);
    }

    public error_message() {
        this(PlayerJniJNI.new_error_message(), true);
    }
}
