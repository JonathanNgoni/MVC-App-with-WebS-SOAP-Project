<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="col-lg-4">
		<h3 style="color: #000080;" class="text-center">Afiche</h3>
		
		<p>
		
				 <%
					String s = (String) request.getAttribute("afiche");
					if(s!= null)
						
						out.print("<font color='green'> <b>"+s+" </b>");
				%>
				
				 </p>
			<p>
				
			</p>
			<br>

			
			
				
              


	</div>
	<div class="col-lg-4"></div>



</body>
</html>