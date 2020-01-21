<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 <!--  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script> -->

<title>Person Details</title>
</head>
<body bgcolor="black">
          <h1 style="color:white;text-align:center">SSA Registration Form</h1>
          
	<form:form action="saveDetails" method="POST" modelAttribute="personDetails">
		<h1 style="color:green;text-align:center">  ${result}<br></h1>
		<table border="8" bgcolor="red" align="center">
			<tr>
				<td>First Name: </td>
				<td><form:input path="fName"/></td>
			</tr>
			<tr>
				<td>Last Name: </td>
				<td><form:input path="lName"/></td>
			</tr>
			<tr>
				<td>Date Of Birth: </td>
				<td><p><form:input type="date" path="dob" /></p></td>
			</tr>
			<tr>
				<td>Gender: </td>
				<td>
					<form:radiobutton path="gender" value="Male"/>Male &nbsp;&nbsp;&nbsp;&nbsp;
					<form:radiobutton path="gender" value="Female"/>Female
				</td>
			</tr>
			<tr>
				<td>State: </td>
				<td><form:select path="state">
					<form:option value="NONE">-select-</form:option>
					<form:options items="${stateList}"/>
				</form:select></td>
			</tr>
			<tr>
				<td colspan="2">
				    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				    <input type="reset"  value="Reset">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				    <input type="submit"  value="Submit">
				    
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>