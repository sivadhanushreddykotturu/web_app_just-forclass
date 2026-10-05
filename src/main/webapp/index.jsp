<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator - Jenkins CI/CD</title>
    <style>
        :root {
            --bg-dark: #0f172a;
            --card-bg: #1e293b;
            --accent-lime: #b9ff66;
            --accent-blue: #38bdf8;
            --text-light: #f8fafc;
            --text-dim: #94a3b8;
        }
        * { box-sizing: border-box; margin: 0; padding: 0; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif; }
        body { background: var(--bg-dark); color: var(--text-light); min-height: 100vh; display: flex; align-items: center; justify-content: center; padding: 20px; }
        .calc-card { background: var(--card-bg); border: 1px solid rgba(255,255,255,0.1); border-radius: 24px; padding: 32px; width: 100%; max-width: 440px; box-shadow: 0 20px 40px rgba(0,0,0,0.5); }
        .badge { display: inline-block; font-size: 11px; font-weight: 700; padding: 4px 12px; border-radius: 20px; background: rgba(185, 255, 102, 0.15); color: var(--accent-lime); border: 1px solid rgba(185, 255, 102, 0.3); margin-bottom: 12px; }
        h1 { font-size: 22px; font-weight: 800; margin-bottom: 4px; }
        p { font-size: 12px; color: var(--text-dim); margin-bottom: 24px; }
        .form-group { margin-bottom: 16px; }
        label { display: block; font-size: 12px; font-weight: 700; color: var(--text-dim); margin-bottom: 6px; text-transform: uppercase; }
        input, select { width: 100%; background: #0a0e17; border: 1px solid rgba(255,255,255,0.15); border-radius: 12px; padding: 12px 14px; color: #fff; font-size: 15px; outline: none; }
        input:focus, select:focus { border-color: var(--accent-lime); }
        .btn-calc { width: 100%; background: var(--accent-lime); color: #0a0e17; font-size: 14px; font-weight: 800; padding: 14px; border-radius: 12px; border: none; cursor: pointer; margin-top: 8px; transition: transform 0.1s; }
        .btn-calc:hover { background: #a3e635; transform: translateY(-1px); }
        .result-box { margin-top: 20px; background: #0a0e17; border: 1px solid rgba(185, 255, 102, 0.3); border-radius: 14px; padding: 16px; text-align: center; }
        .result-val { font-size: 28px; font-weight: 800; color: var(--accent-lime); margin-top: 4px; }
    </style>
</head>
<body>
    <div class="calc-card">
        <span class="badge" style="color: #38bdf8; border-color: rgba(56, 189, 248, 0.4); background: rgba(56, 189, 248, 0.15);">BUILD #3 - MULTIPLY &amp; DIVIDE (4 TESTS)</span>
        <h1>🧮 Simple Calculator</h1>
        <p>Jenkins CI/CD Automation Web Application</p>

        <form action="calculate" method="post">
            <div class="form-group">
                <label>First Number</label>
                <input type="number" step="any" name="num1" value="${num1 != null ? num1 : '10'}" required />
            </div>

            <div class="form-group">
                <label>Operation</label>
                <select name="operation">
                    <option value="add" ${operation == 'add' ? 'selected' : ''}>➕ Addition (+)</option>
                    <option value="subtract" ${operation == 'subtract' ? 'selected' : ''}>➖ Subtraction (-)</option>
                    <option value="multiply" ${operation == 'multiply' ? 'selected' : ''}>✖️ Multiplication (*)</option>
                    <option value="divide" ${operation == 'divide' ? 'selected' : ''}>➗ Division (/)</option>
                </select>
            </div>

            <div class="form-group">
                <label>Second Number</label>
                <input type="number" step="any" name="num2" value="${num2 != null ? num2 : '5'}" required />
            </div>

            <button type="submit" class="btn-calc">Calculate Result</button>
        </form>

        <% if (request.getAttribute("hasResult") != null) { %>
            <div class="result-box">
                <span style="font-size: 12px; color: var(--text-dim);">Calculation Output</span>
                <div class="result-val">${result}</div>
            </div>
        <% } %>
    </div>
</body>
</html>
