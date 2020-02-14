<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"> 
</head>
<body style="background-color:#eee; font-family: sans-serif">


	<nav class="navbar navbar-inverse navbar-static-top" style="" role="navigation">
		<div class="navbar-header active">

			<a href="Admin.jsp" class="navbar-brand">University Constantine 2</a>

		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="Admin.jsp" class="dropdown-toggle"
					data-toggle="dropdown">Home</a>
					<ul class="dropdown-menu">
						<li><a href="ChefDepart.jsp">Open Year</a></li>
						<li><a href="Affectation.jsp">Affectation Student Status</a></li>
						
			     </ul>
              </li>
             <li><a href="NewIns.jsp">Nouvelle Inscription</a></li>
            <li><a href="ReIns.jsp">ReInscription</a></li>
            <li><a href="Consultation.jsp">Consultation</a></li>
			<li class="active"><a href="homePage.jsp">About</a></li>
			</ul>

		</div>
	</nav>

<%!String title = "loginadmin";%>



<div class="container"
	style="background-image: url('bootstrap/images/plae.jpg');">
      <div class="row">
	<div class="col-lg-4"></div>

	<div class="col-lg-4">
	
	
		<h3 style="color: #000080;" class="text-center">Consultation  Liste des Etudients </h3>
		<form role="form" action="ScolaControla" method="post">
		<input type="hidden" name="formuler" value="liste">
		<p>

				<h3>     LISTE DE    <select name="liste" ></h3>
				<option > Edutient</option>
				 <option value="valided">Inscrit</option>
				  <option value="blocked">Blocké</option>
				   <option value="fin">Fin</option>
				    
				 </select>
			</p>
			<br>
			</p><br>
			
			<input type="submit" name="send" class="btn btn-default btn-primary " value="Consulter">

              </form>

</body>
</html>