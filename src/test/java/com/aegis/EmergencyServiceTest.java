package com.aegis;

import com.aegis.service.EmergencyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmergencyServiceTest {

    private EmergencyService emergencyService;

    @BeforeEach
    void setUp() {
        emergencyService = new EmergencyService();
    }

    @Test
    void testGetActiveIncidents() {
        List<EmergencyService.IncidentReport> incidents = emergencyService.getActiveIncidents();
        assertNotNull(incidents, "Incident list should not be null");
        assertEquals(3, incidents.size(), "Should contain 3 initial active incidents");
    }

    @Test
    void testValidateIncident() {
        assertTrue(emergencyService.validateIncident("Earthquake Damage", 15));
        assertFalse(emergencyService.validateIncident("", 10));
        assertFalse(emergencyService.validateIncident("Storm", -5));
    }

    @Test
    void testCalculateSeverity() {
        assertEquals("CRITICAL", emergencyService.calculateSeverity(50));
        assertEquals("HIGH", emergencyService.calculateSeverity(15));
        assertEquals("MODERATE", emergencyService.calculateSeverity(4));
        assertEquals("LOW", emergencyService.calculateSeverity(0));
    }

    @Test
    void testCalculateRequiredRescueUnits() {
        assertEquals(7, emergencyService.calculateRequiredRescueUnits(18, "HAZMAT"));
        assertEquals(7, emergencyService.calculateRequiredRescueUnits(42, "FLOOD"));
        assertEquals(1, emergencyService.calculateRequiredRescueUnits(2, "FIRE"));
    }

    @Test
    void testGetDeploymentReadinessScore() {
        assertEquals(99.4, emergencyService.getDeploymentReadinessScore());
    }
}
