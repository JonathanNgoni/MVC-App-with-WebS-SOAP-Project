<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >


<%!String title = "loginadmin";%>

<%@ include file="header.html"%>

<div class="container"
	style="background-image: url('bootstrap/images/plae.jpg');">
      <div class="row">
	<div class="col-lg-4"></div>

	<div class="col-lg-4">
		<h3 style="color: #000080;" class="text-center">Chef Department</h3>
		<form role="form" action="ScolaControla" method="post">
		<input type="hidden" name="formuler" value="chefD">
		<p>
		 <%
					String s = (String) request.getAttribute("errour!");
					if(s!= null)
						out.print("<font color='red'>"+s+"");
				%>
				 </p>
			<p>
				<b>Ouvreture L'annee Academic </b><input type="text" name="year" placeholder="yyyy/yyyy"
					class="form-control">
			</p>
			<br>
			</p><br>
			
			<input type="submit" name="send" class="btn btn-default btn-primary " value="Open">

              </form>

</body>
</html>