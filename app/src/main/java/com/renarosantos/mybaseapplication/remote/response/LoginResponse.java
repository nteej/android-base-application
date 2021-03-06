package com.renarosantos.mybaseapplication.remote.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by renarosantos on 15/09/15.
 */
public class LoginResponse {

    @SerializedName("session_id")
    private String mSession;

    @SerializedName("user_id")
    private String mUserId;

    @SerializedName("status")
    private boolean status;

    @SerializedName("error")
    private int error;

    public String getSession() {
        return mSession;
    }

    public String getUserId() {
        return mUserId;
    }

    public boolean getStatus() {
        return status;
    }

    public int getError() {
        return error;
    }

    private LoginResponse(final String session, final String userId, final boolean status) {
        mSession = session;
        mUserId = userId;
        this.status = status;
    }

    /**
     * @return a Mock LoginResponse, only use this method to TEST!
     */
    public static LoginResponse mock() {
        return new LoginResponse("session-mocked-get-123","user-id-mocked-123", true);
    }
}
