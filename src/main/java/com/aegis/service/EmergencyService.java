package com.aegis.service;

import java.util.ArrayList;
import java.util.List;

public class EmergencyService {

    public static class IncidentReport {
        private String title;
        private String disasterType;
        private String zoneLocation;
        private int casualtyEstimate;
        private String priorityLevel;

        public IncidentReport(String title, String disasterType, String zoneLocation, int casualtyEstimate, String priorityLevel) {
            this.title = title;
            this.disasterType = disasterType;
            this.zoneLocation = zoneLocation;
            this.casualtyEstimate = casualtyEstimate;
            this.priorityLevel = priorityLevel;
        }

        public String getTitle() { return title; }
        public String getDisasterType() { return disasterType; }
        public String getZoneLocation() { return zoneLocation; }
        public int getCasualtyEstimate() { return casualtyEstimate; }
        public String getPriorityLevel() { return priorityLevel; }
    }

    public List<IncidentReport> getActiveIncidents() {
        List<IncidentReport> list = new ArrayList<>();
        list.add(new IncidentReport("Flash Flood Inundation", "FLOOD", "Sector Alpha", 42, "CRITICAL"));
        list.add(new IncidentReport("Toxic Chemical Vapor Leak", "HAZMAT", "Sector Delta", 18, "CRITICAL"));
        list.add(new IncidentReport("Ridge Forest Wildfire Front", "FIRE", "Sector Gamma", 7, "HIGH"));
        return list;
    }

    public boolean validateIncident(String title, int casualties) {
        return title != null && !title.trim().isEmpty() && casualties >= 0;
    }

    public String calculateSeverity(int casualties) {
        if (casualties > 25) return "CRITICAL";
        if (casualties > 10) return "HIGH";
        if (casualties > 0) return "MODERATE";
        return "LOW";
    }

    public int calculateRequiredRescueUnits(int casualties, String disasterType) {
        if ("HAZMAT".equalsIgnoreCase(disasterType)) {
            return (int) Math.ceil(casualties / 4.0) + 2; // Extra containment buffer
        }
        return (int) Math.max(1, Math.ceil(casualties / 6.0));
    }

    public double getDeploymentReadinessScore() {
        return 99.4; // 99.4% Tactical Mesh Readiness
    }
}
