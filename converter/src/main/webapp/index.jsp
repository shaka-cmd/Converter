<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Simple Converter</title>
</head>
<body>
<h1>Converter</h1>
<form method="post" action="converter" id="conversionForm">
  <div class="form-group">
    <label for="baseten">Enter Base 10 Number</label>
    <input id="baseten" type="number" name="baseten" value="${baseten}">
  </div>
  <div>
    <input type="button" value="Binary" onclick="setConversionType('binary')">
    <input type="button" value="Hexa" onclick="setConversionType('hexa')">
    <input type="button" value="Octal" onclick="setConversionType('octal')">
  </div>
  <input type="hidden" name="conversionType" id="conversionType" value="">
</form>
<div>
  <h2>Result</h2>
  <h3>Number: ${baseten}</h3>
  <h3>Result: ${result}</h3>
</div>

<div>
  <ul>
    <li style="color: cornflowerblue">${message}</li>
  </ul>
</div>
<script>
  function setConversionType(type) {
    document.getElementById('conversionType').value = type;
    document.getElementById('conversionForm').submit();
  }
</script>
</body>
</html>