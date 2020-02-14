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
	style="background-image: url('bootstrap/images/plae.jpg');">
      <div class="row">
	<div class="col-lg-4"></div>

	<div class="col-lg-4">
		<h3 style="color: #000080;" class="text-center">ReInscription</h3>
		<form role="form" action="ScolaControla" method="post">
		<input type="hidden" name="formuler" value="reIns">
		<p>
		 <%
					String s = (String) request.getAttribute("errour!");
					if(s!= null)
						out.print("<font color='red'>"+s+"");
				%>
				 </p>
			<p>
				Numero Etudiant <input type="text" name="idStudent" placeholder="id student ici !"
					class="form-control">
			</p>
			<br>
			<p>
				Specialite  <select name="specialite" >
				<option value="0">  specialite </option>
				 <option value="stic">STIC</option>
				  <option value="gl">GL</option>
				   <option value="rsd">RSD</option>
				    <option value="sci">SCI</option>
				     <option value="si">SI</option>
				 </select>
			</p>
<br>
			<p>
				Niveau <select name="niveau" >
				<option value="0">  Niveau </option>
				 <option value="1">L1</option>
				  <option value="2">L2</option>
				   <option value="3">L3</option>
				    <option value="4">M1</option>
				     <option value="5">M2</option>
				 </select>
					
					<br>
			</p>
			<br>
				
			
			<input type="submit" name="send" class="btn btn-default btn-primary " value="submit">

              </form>


	</div>
	<div class="col-lg-4"></div>
	
	</div>

<br>

</body>
</html>