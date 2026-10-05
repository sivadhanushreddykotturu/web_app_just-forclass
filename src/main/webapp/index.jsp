<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aegis Emergency CI/CD Portal</title>
    <style>
        :root {
            --bg-dark: #0a0e17;
            --card-bg: #121824;
            --accent-lime: #b9ff66;
            --accent-blue: #38bdf8;
            --accent-red: #f43f5e;
            --text-light: #f8fafc;
            --text-dim: #94a3b8;
        }
        * { box-sizing: border-box; margin: 0; padding: 0; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif; }
        body { background: var(--bg-dark); color: var(--text-light); min-height: 100vh; padding: 30px 20px; }
        .container { max-width: 900px; margin: 0 auto; }
        .header-box { background: var(--card-bg); border: 1px solid rgba(255,255,255,0.08); border-radius: 20px; padding: 24px; margin-bottom: 20px; display: flex; justify-content: space-between; align-items: center; }
        .brand-title { font-size: 22px; font-weight: 800; color: #fff; }
        .badge { font-size: 11px; font-weight: 700; padding: 4px 10px; border-radius: 20px; background: rgba(185, 255, 102, 0.15); color: var(--accent-lime); border: 1px solid rgba(185, 255, 102, 0.3); }
        .card { background: var(--card-bg); border: 1px solid rgba(255,255,255,0.08); border-radius: 20px; padding: 24px; margin-bottom: 20px; }
        .grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(260px, 1fr)); gap: 16px; margin-top: 16px; }
        .incident-card { background: #0a0e17; border: 1px solid rgba(255,255,255,0.06); border-radius: 14px; padding: 16px; }
        .tag-red { color: #fb7185; font-weight: 700; font-size: 11px; }
        .tag-blue { color: #38bdf8; font-weight: 700; font-size: 11px; }
        .btn { display: inline-block; background: var(--accent-lime); color: #0a0e17; font-weight: 700; font-size: 12px; padding: 8px 16px; border-radius: 20px; text-decoration: none; margin-top: 12px; }
    </style>
</head>
<body>
    <div class="container">
        <div class="header-box">
            <div>
                <h1 class="brand-title">🚨 Aegis Emergency Operations</h1>
                <p style="color: var(--text-dim); font-size: 12px; margin-top: 4px;">Continuous Integration & Deployment via Jenkins & Tomcat</p>
            </div>
            <span class="badge" style="color: #38bdf8; border-color: rgba(56, 189, 248, 0.4); background: rgba(56, 189, 248, 0.15);">BUILD #3 - v1.0.2 (JUNIT 5 REGRESSION: 5/5 TESTS PASSED)</span>
        </div>

        <div style="background: rgba(185, 255, 102, 0.08); border: 1px solid rgba(185, 255, 102, 0.2); border-radius: 14px; padding: 14px 20px; margin-bottom: 20px; display: flex; justify-content: space-between; align-items: center;">
            <div>
                <span style="font-size: 11px; color: var(--accent-lime); font-weight: 700; text-transform: uppercase;">Tactical Dispatch Readiness</span>
                <div style="font-size: 18px; font-weight: 800; color: #fff;">99.4% Operational Response Score</div>
            </div>
            <span style="font-size: 12px; color: var(--text-dim);">Automated Triage: <b>ACTIVE</b></span>
        </div>

        <div class="card">
            <h2 style="font-size: 16px; margin-bottom: 8px;">Active Incident Dispatch Feed</h2>
            <p style="color: var(--text-dim); font-size: 13px;">Real-time automated incident registry monitored by Jenkins Pipeline.</p>
            
            <div class="grid">
                <div class="incident-card">
                    <div style="display:flex; justify-content:space-between; margin-bottom: 6px;">
                        <span class="tag-red">CRITICAL</span>
                        <span style="font-size:11px; color:var(--text-dim);">Sector Alpha</span>
                    </div>
                    <h3 style="font-size: 14px; font-weight: 700;">Flash Flood Inundation</h3>
                    <p style="font-size: 12px; color: var(--text-dim); margin: 6px 0;">Casualties: 42 | Fleet: Rescue Delta</p>
                </div>

                <div class="incident-card">
                    <div style="display:flex; justify-content:space-between; margin-bottom: 6px;">
                        <span class="tag-red">CRITICAL</span>
                        <span style="font-size:11px; color:var(--text-dim);">Sector Delta</span>
                    </div>
                    <h3 style="font-size: 14px; font-weight: 700;">Toxic Vapor Leak</h3>
                    <p style="font-size: 12px; color: var(--text-dim); margin: 6px 0;">Casualties: 18 | Fleet: HAZMAT Unit 4</p>
                </div>

                <div class="incident-card">
                    <div style="display:flex; justify-content:space-between; margin-bottom: 6px;">
                        <span class="tag-blue">HIGH</span>
                        <span style="font-size:11px; color:var(--text-dim);">Sector Gamma</span>
                    </div>
                    <h3 style="font-size: 14px; font-weight: 700;">Ridge Forest Wildfire</h3>
                    <p style="font-size: 12px; color: var(--text-dim); margin: 6px 0;">Casualties: 7 | Fleet: Drone Recon</p>
                </div>
            </div>

            <a href="api/incidents" target="_blank" class="btn">View Raw JSON API</a>
        </div>
    </div>
</body>
</html>
