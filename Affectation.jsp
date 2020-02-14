<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#eee; font-family: sans-serif">

	<nav class="navbar navbar-inverse navbar-static-top" style="" role="navigation">
		<div class="navbar-header active">

			<a href="homePage.jsp" class="navbar-brand">University Constantine 2</a>

		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Services Scolarite</a>
					<ul class="dropdown-menu">
						<li><a href="ChefDepart.jsp">Open Year</a></li>
						<li class="divider"></li>
						<li><a href="Affectation.jsp">Affectation Student Status</a></li></li>
						<li><a href="Consultation.jsp">Consultation</a></li></li>
			</ul>


			<li class="active"><a href="homePage.jsp">About</a></li>
			</ul>

			<form class="navbar-right navbar-form" role="search">
				<div class="form-group">

					<input type="text" name="navigation" placeholder="search..."
						value="" class="form-control">


				</div>
				<input type="hidden" value="hiddennav">

			</form>



		</div>





	</nav>


<%!String title = "loginadmin";%>

<%@ include file="header.html"%>

<div class="container"
	style="background-image: url('bootstrap/images/plae.jpg');">
      <div class="row">
	<div class="col-lg-4"></div>

	<div class="col-lg-4">
		<h3 style="color: #000080;" class="text-center">Chef Department</h3>
		<form role="form" action="ScolaControla" method="post">
		<input type="hidden" name="formuler" value="status">
		<p>
		 <%
					String s = (String) request.getAttribute("errour!");
					if(s!= null)
						out.print("<font color='red'>"+s+"");
				%>
				 </p>
			<p>
				Student ID <input type="text" name="stdID" placeholder="id_student"
					class="form-control">
			</p>
			<p>STATUS ETUDIANT/E<select name="status" >
				<option >Status</option>
				 <option value="valided">Valider</option>
				  <option value="blocked">Blocker</option>
				   <option value="fin">Fin</option>
				    
				 </select>
		     </p>
			<br>
			</p><br>
			
			<input type="submit" name="send" class="btn btn-default btn-primary " value="Open">

              </form>

</body>
</html>