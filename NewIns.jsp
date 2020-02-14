<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String title = "loginadmin";%>

<%@ include file="header.html"%>

<div class="container"
	style="background-image: url('bootstrap/images/');">
      <div class="row">
	<div class="col-lg-4"></div>

	<div class="col-lg-4">
		<h3 style="color: #000080;" class="text-center">New Students</h3>
		<form role="form" action="scholars/ScolaControla" method="post">
		<input type="hidden" name="formuler" value="register">
		<p>
		 <%
					String s = (String) request.getAttribute("errour!");
					if(s!= null)
						out.print("<font color='red'>"+s+"");
				%>
				 </p>
			<p>
				Nom<input type="text" name="nomS" placeholder="nom ici!"
					class="form-control">
			</p>
			<br>

			<p>
				Prenom<input type="text" name="prenomS"
					placehoder="prenom!" class="form-control">
					<br>
			</p>
			<br>
			
			
			<p>
				Date de Naisance<input type="text" name="dob"
					placehoder="date de naisance " class="form-control">
					<br>
			</p>
			
			<p>
				Adress<input type="text" name="adress"
					placehoder="adress !" class="form-control">
					<br>
			</p>
			
			
			<p>
				email <input type="text" name="email"
					placehoder="email !" class="form-control">
					<br>
			</p>
			<br>
			<p>
				Specialite <select name="specialite" >
				<option >specialite</option>
				 <option value="stic">STIC</option>
				  <option value="gl">GL</option>
				   <option value="rsd">RSD</option>
				    <option value="sci">SCI</option>
				     <option value="si">SI</option>
				 </select>
			</p><br>
			<br>
			<p>
			Niveau <select name="niveau" >
				<option value="0">Niveau</option>
				 <option value="1">L1</option>
				  <option value="2">L2</option>
				   <option value="3">L3</option>
				    <option value="4">M1</option>
				     <option value="5">M2</option>
				 </select>
			</p><br>
			
			<input type="submit" name="send" class="btn btn-default btn-primary " value="submit">

              </form>


	</div>
	<div class="col-lg-4"></div>
	
	</div>

<br>
</body>
</html>