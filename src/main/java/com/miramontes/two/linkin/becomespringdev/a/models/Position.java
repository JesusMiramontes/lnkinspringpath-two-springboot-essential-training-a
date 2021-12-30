package com.miramontes.two.linkin.becomespringdev.a.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    @Override
    public String toString() {
        switch (this){
            case CONCIERGE:
                return "Concierge";
            case HOUSEKEEPING:
                return "Housekeeping";
            case FRONT_DESK:
                return "Front desk";
            case SECURITY:
                return "Security";
        }
        return "";
    }
}
