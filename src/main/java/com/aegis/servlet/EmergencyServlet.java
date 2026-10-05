package com.aegis.servlet;

import com.aegis.service.EmergencyService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "EmergencyServlet", urlPatterns = {"/api/incidents"})
public class EmergencyServlet extends HttpServlet {

    private final EmergencyService emergencyService = new EmergencyService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        List<EmergencyService.IncidentReport> incidents = emergencyService.getActiveIncidents();

        PrintWriter out = resp.getWriter();
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < incidents.size(); i++) {
            EmergencyService.IncidentReport inc = incidents.get(i);
            json.append(String.format("{\"title\":\"%s\",\"type\":\"%s\",\"zone\":\"%s\",\"casualties\":%d,\"severity\":\"%s\"}",
                    inc.getTitle(), inc.getDisasterType(), inc.getZoneLocation(), inc.getCasualtyEstimate(), inc.getPriorityLevel()));
            if (i < incidents.size() - 1) json.append(",");
        }
        json.append("]");

        out.print(json.toString());
        out.flush();
    }
}
