package com.soundcloud.flippernative.api;

public class audio_performance extends BaseAudioPerformanceEvent {
    private transient long swigCPtr;

    protected audio_performance(long j, boolean z) {
        super(PlayerJniJNI.audio_performance_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    protected static long getCPtr(audio_performance audio_performance) {
        if (audio_performance == null) {
            return 0;
        }
        return audio_performance.swigCPtr;
    }

    public static String schemaVersion() {
        return PlayerJniJNI.audio_performance_schemaVersion();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_audio_performance(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public PropertyString getAnonymous_id() {
        long audio_performance_anonymous_id_get = PlayerJniJNI.audio_performance_anonymous_id_get(this.swigCPtr, this);
        if (audio_performance_anonymous_id_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_anonymous_id_get, false);
    }

    public PropertyAppState getApp_state() {
        long audio_performance_app_state_get = PlayerJniJNI.audio_performance_app_state_get(this.swigCPtr, this);
        if (audio_performance_app_state_get == 0) {
            return null;
        }
        return new PropertyAppState(audio_performance_app_state_get, false);
    }

    public PropertyString getApp_version() {
        long audio_performance_app_version_get = PlayerJniJNI.audio_performance_app_version_get(this.swigCPtr, this);
        if (audio_performance_app_version_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_app_version_get, false);
    }

    public SWIGTYPE_p_PropertyT_Events__audio_performance_audio_quality_mode_t_false_t getAudio_quality_mode() {
        long audio_performance_audio_quality_mode_get = PlayerJniJNI.audio_performance_audio_quality_mode_get(this.swigCPtr, this);
        if (audio_performance_audio_quality_mode_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_PropertyT_Events__audio_performance_audio_quality_mode_t_false_t(audio_performance_audio_quality_mode_get, false);
    }

    public PropertyInt64 getBitrate() {
        long audio_performance_bitrate_get = PlayerJniJNI.audio_performance_bitrate_get(this.swigCPtr, this);
        if (audio_performance_bitrate_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_bitrate_get, false);
    }

    public PropertyInt64 getClient_id() {
        long audio_performance_client_id_get = PlayerJniJNI.audio_performance_client_id_get(this.swigCPtr, this);
        if (audio_performance_client_id_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_client_id_get, false);
    }

    public PropertyString getConnection_type() {
        long audio_performance_connection_type_get = PlayerJniJNI.audio_performance_connection_type_get(this.swigCPtr, this);
        if (audio_performance_connection_type_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_connection_type_get, false);
    }

    public PropertyAnyEvent getDetails() {
        long audio_performance_details_get = PlayerJniJNI.audio_performance_details_get(this.swigCPtr, this);
        if (audio_performance_details_get == 0) {
            return null;
        }
        return new PropertyAnyEvent(audio_performance_details_get, false);
    }

    public SWIGTYPE_p_PropertyT_Events__audio_performance_entity_type_t_false_t getEntity_type() {
        long audio_performance_entity_type_get = PlayerJniJNI.audio_performance_entity_type_get(this.swigCPtr, this);
        if (audio_performance_entity_type_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_PropertyT_Events__audio_performance_entity_type_t_false_t(audio_performance_entity_type_get, false);
    }

    public PropertyInt64 getExp_android_listening() {
        long audio_performance_exp_android_listening_get = PlayerJniJNI.audio_performance_exp_android_listening_get(this.swigCPtr, this);
        if (audio_performance_exp_android_listening_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_exp_android_listening_get, false);
    }

    public PropertyInt64 getExp_creator() {
        long audio_performance_exp_creator_get = PlayerJniJNI.audio_performance_exp_creator_get(this.swigCPtr, this);
        if (audio_performance_exp_creator_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_exp_creator_get, false);
    }

    public PropertyInt64 getExp_creator_subs() {
        long audio_performance_exp_creator_subs_get = PlayerJniJNI.audio_performance_exp_creator_subs_get(this.swigCPtr, this);
        if (audio_performance_exp_creator_subs_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_exp_creator_subs_get, false);
    }

    public PropertyInt64 getExp_mweb_listening() {
        long audio_performance_exp_mweb_listening_get = PlayerJniJNI.audio_performance_exp_mweb_listening_get(this.swigCPtr, this);
        if (audio_performance_exp_mweb_listening_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_exp_mweb_listening_get, false);
    }

    public PropertyInt64 getExp_v2_listening() {
        long audio_performance_exp_v2_listening_get = PlayerJniJNI.audio_performance_exp_v2_listening_get(this.swigCPtr, this);
        if (audio_performance_exp_v2_listening_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_exp_v2_listening_get, false);
    }

    public PropertyInt64 getExp_widget_listening() {
        long audio_performance_exp_widget_listening_get = PlayerJniJNI.audio_performance_exp_widget_listening_get(this.swigCPtr, this);
        if (audio_performance_exp_widget_listening_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_exp_widget_listening_get, false);
    }

    public PropertyString getFormat() {
        long audio_performance_format_get = PlayerJniJNI.audio_performance_format_get(this.swigCPtr, this);
        if (audio_performance_format_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_format_get, false);
    }

    public PropertyString getHost() {
        long audio_performance_host_get = PlayerJniJNI.audio_performance_host_get(this.swigCPtr, this);
        if (audio_performance_host_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_host_get, false);
    }

    public PropertyInt64 getLatency() {
        long audio_performance_latency_get = PlayerJniJNI.audio_performance_latency_get(this.swigCPtr, this);
        if (audio_performance_latency_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_latency_get, false);
    }

    public PropertyString getPage_name() {
        long audio_performance_page_name_get = PlayerJniJNI.audio_performance_page_name_get(this.swigCPtr, this);
        if (audio_performance_page_name_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_page_name_get, false);
    }

    public PropertyString getPage_urn() {
        long audio_performance_page_urn_get = PlayerJniJNI.audio_performance_page_urn_get(this.swigCPtr, this);
        if (audio_performance_page_urn_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_page_urn_get, false);
    }

    public PropertyInt64 getPlayer_build_number() {
        long audio_performance_player_build_number_get = PlayerJniJNI.audio_performance_player_build_number_get(this.swigCPtr, this);
        if (audio_performance_player_build_number_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_player_build_number_get, false);
    }

    public PropertyString getPlayer_type() {
        long audio_performance_player_type_get = PlayerJniJNI.audio_performance_player_type_get(this.swigCPtr, this);
        if (audio_performance_player_type_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_player_type_get, false);
    }

    public PropertyString getPlayer_variant() {
        long audio_performance_player_variant_get = PlayerJniJNI.audio_performance_player_variant_get(this.swigCPtr, this);
        if (audio_performance_player_variant_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_player_variant_get, false);
    }

    public PropertyString getPlayer_version() {
        long audio_performance_player_version_get = PlayerJniJNI.audio_performance_player_version_get(this.swigCPtr, this);
        if (audio_performance_player_version_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_player_version_get, false);
    }

    public PropertyPreloaded getPreloaded() {
        long audio_performance_preloaded_get = PlayerJniJNI.audio_performance_preloaded_get(this.swigCPtr, this);
        if (audio_performance_preloaded_get == 0) {
            return null;
        }
        return new PropertyPreloaded(audio_performance_preloaded_get, false);
    }

    public PropertyString getPreset() {
        long audio_performance_preset_get = PlayerJniJNI.audio_performance_preset_get(this.swigCPtr, this);
        if (audio_performance_preset_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_preset_get, false);
    }

    public PropertyString getProtocol() {
        long audio_performance_protocol_get = PlayerJniJNI.audio_performance_protocol_get(this.swigCPtr, this);
        if (audio_performance_protocol_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_protocol_get, false);
    }

    public SWIGTYPE_p_PropertyT_Events__audio_performance_quality_t_false_t getQuality() {
        long audio_performance_quality_get = PlayerJniJNI.audio_performance_quality_get(this.swigCPtr, this);
        if (audio_performance_quality_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_PropertyT_Events__audio_performance_quality_t_false_t(audio_performance_quality_get, false);
    }

    public PropertyString getReferrer() {
        long audio_performance_referrer_get = PlayerJniJNI.audio_performance_referrer_get(this.swigCPtr, this);
        if (audio_performance_referrer_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_referrer_get, false);
    }

    public PropertyString getTrack_urn() {
        long audio_performance_track_urn_get = PlayerJniJNI.audio_performance_track_urn_get(this.swigCPtr, this);
        if (audio_performance_track_urn_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_track_urn_get, false);
    }

    public PropertyInt64 getTs() {
        long audio_performance_ts_get = PlayerJniJNI.audio_performance_ts_get(this.swigCPtr, this);
        if (audio_performance_ts_get == 0) {
            return null;
        }
        return new PropertyInt64(audio_performance_ts_get, false);
    }

    public PropertyString getType() {
        long audio_performance_type_get = PlayerJniJNI.audio_performance_type_get(this.swigCPtr, this);
        if (audio_performance_type_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_type_get, false);
    }

    public PropertySecureUri getUrl() {
        long audio_performance_url_get = PlayerJniJNI.audio_performance_url_get(this.swigCPtr, this);
        if (audio_performance_url_get == 0) {
            return null;
        }
        return new PropertySecureUri(audio_performance_url_get, false);
    }

    public PropertyString getUser() {
        long audio_performance_user_get = PlayerJniJNI.audio_performance_user_get(this.swigCPtr, this);
        if (audio_performance_user_get == 0) {
            return null;
        }
        return new PropertyString(audio_performance_user_get, false);
    }

    public void setAnonymous_id(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_anonymous_id_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setApp_state(PropertyAppState propertyAppState) {
        PlayerJniJNI.audio_performance_app_state_set(this.swigCPtr, this, PropertyAppState.getCPtr(propertyAppState), propertyAppState);
    }

    public void setApp_version(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_app_version_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setAudio_quality_mode(SWIGTYPE_p_PropertyT_Events__audio_performance_audio_quality_mode_t_false_t sWIGTYPE_p_PropertyT_Events__audio_performance_audio_quality_mode_t_false_t) {
        PlayerJniJNI.audio_performance_audio_quality_mode_set(this.swigCPtr, this, SWIGTYPE_p_PropertyT_Events__audio_performance_audio_quality_mode_t_false_t.getCPtr(sWIGTYPE_p_PropertyT_Events__audio_performance_audio_quality_mode_t_false_t));
    }

    public void setBitrate(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_bitrate_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setClient_id(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_client_id_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setConnection_type(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_connection_type_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setDetails(PropertyAnyEvent propertyAnyEvent) {
        PlayerJniJNI.audio_performance_details_set(this.swigCPtr, this, PropertyAnyEvent.getCPtr(propertyAnyEvent), propertyAnyEvent);
    }

    public void setEntity_type(SWIGTYPE_p_PropertyT_Events__audio_performance_entity_type_t_false_t sWIGTYPE_p_PropertyT_Events__audio_performance_entity_type_t_false_t) {
        PlayerJniJNI.audio_performance_entity_type_set(this.swigCPtr, this, SWIGTYPE_p_PropertyT_Events__audio_performance_entity_type_t_false_t.getCPtr(sWIGTYPE_p_PropertyT_Events__audio_performance_entity_type_t_false_t));
    }

    public void setExp_android_listening(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_exp_android_listening_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setExp_creator(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_exp_creator_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setExp_creator_subs(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_exp_creator_subs_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setExp_mweb_listening(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_exp_mweb_listening_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setExp_v2_listening(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_exp_v2_listening_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setExp_widget_listening(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_exp_widget_listening_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setFormat(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_format_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setHost(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_host_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setLatency(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_latency_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setPage_name(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_page_name_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setPage_urn(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_page_urn_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setPlayer_build_number(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_player_build_number_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setPlayer_type(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_player_type_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setPlayer_variant(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_player_variant_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setPlayer_version(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_player_version_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setPreloaded(PropertyPreloaded propertyPreloaded) {
        PlayerJniJNI.audio_performance_preloaded_set(this.swigCPtr, this, PropertyPreloaded.getCPtr(propertyPreloaded), propertyPreloaded);
    }

    public void setPreset(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_preset_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setProtocol(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_protocol_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setQuality(SWIGTYPE_p_PropertyT_Events__audio_performance_quality_t_false_t sWIGTYPE_p_PropertyT_Events__audio_performance_quality_t_false_t) {
        PlayerJniJNI.audio_performance_quality_set(this.swigCPtr, this, SWIGTYPE_p_PropertyT_Events__audio_performance_quality_t_false_t.getCPtr(sWIGTYPE_p_PropertyT_Events__audio_performance_quality_t_false_t));
    }

    public void setReferrer(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_referrer_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setTrack_urn(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_track_urn_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setTs(PropertyInt64 propertyInt64) {
        PlayerJniJNI.audio_performance_ts_set(this.swigCPtr, this, PropertyInt64.getCPtr(propertyInt64), propertyInt64);
    }

    public void setType(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_type_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public void setUrl(PropertySecureUri propertySecureUri) {
        PlayerJniJNI.audio_performance_url_set(this.swigCPtr, this, PropertySecureUri.getCPtr(propertySecureUri), propertySecureUri);
    }

    public void setUser(PropertyString propertyString) {
        PlayerJniJNI.audio_performance_user_set(this.swigCPtr, this, PropertyString.getCPtr(propertyString), propertyString);
    }

    public audio_performance() {
        this(PlayerJniJNI.new_audio_performance(), true);
    }
}
