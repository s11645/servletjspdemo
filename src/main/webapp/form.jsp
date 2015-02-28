<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="rejesrtacja" action="FormuServlet" method="post">
	<table>
	<tr>
		<td>Imie:</td>
		<td><input name = "imie"></td>
	</tr>
	<tr>
		<td>Nazwisko:</td>
		<td><input name = "nazwisko"></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><input type = "email" name = "email"></td>
	</tr>
	<tr>
		<td>Ponownie Email:</td>
		<td><input type = "email" name = "email2"></td>
	</tr>
	<tr>
		<td>Pracodawca:</td>
		<td><input name = "pracodawca"></td>
	</tr>
	<tr>
		<td>Skad wiesz o "Java 4 US!"?:</td>
	</tr>
	<tr><td><input type="radio" name="skad" value="praca">Ogloszenie w pracy<br></td></tr>
	<tr><td><input type="radio" name="skad" value="uczelnia">Ogloszenie na uczelni<br></td></tr>
	<tr><td><input type="radio" name="skad" value="facebook">Facebook</td></tr>
	<tr><td><input type="radio" name="skad" value="znajomi">Znajomi</td></tr>
	<tr><td><input type="radio" name="skad" value="inne">Inne</td></tr>
	<tr><td><input name = "inne"></td></tr>
	<tr>
		<td>Czym sie zajmujesz?:</td>
		<td><input name = "zajecie"></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><input type = "submit" value = "Wyslij"></td>
	</tr>
	</table>
</form>

</body>
</html>