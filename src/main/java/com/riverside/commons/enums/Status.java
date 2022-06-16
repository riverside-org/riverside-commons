package com.riverside.commons.enums;

public enum Status {
    ACTIVE(1),
    CLOSED(2),
    EXPIRED(3),
    REVOKED(4);

    public final int status;

    public static Status valueOfStatus(int status) {
        for (Status s : values()) {
            if (s.status == status) {
                return s;
            }
        }
        return null;
    }


    private Status(int status) {
        this.status = status;
    }
}
