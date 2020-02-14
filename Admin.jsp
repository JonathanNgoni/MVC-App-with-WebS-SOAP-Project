<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<%!String title = "home_page";%>
<title>home_page</title>
<body style="background-color:#eee">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
	
<div style="position: fixed; top:3px; right: 0; left: 0; z-index: 20;padding-right: 0px;
  padding-left: 15px;">
	

		<nav class="navbar navbar-inverse navbar-static-top" role="navigation">
		<div class="navbar-header active">

			<a href="Admin.jsp" class="navbar-brand">University Constantine </a>

		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Inscription</a>
					<ul class="dropdown-menu">
						<li><a href="NewIns.jsp">Nouvelle Inscription</a></li>
						<li class="divider"></li>
						<li><a href="ReIns.jsp">ReInscription</a></li>
						<li><a href="Consultation.jsp">Consultation</a></li></li>
			</ul>


			<li class="active"><a href="homePage.jsp">About</a></li>
			</ul>

			


		</div>





		</nav>

	
</div>







<div class="row" >
	<div class="col-lg-0"></div>
	<div class="col-lg-12">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">

			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>

			<div class="carousel-inner">
				<div class="item active">
					
						alt="First slide">
					<div class="carousel-caption">University Constantine</div>
				</div>
				<div class="item">
				<div class="carousel-caption">University Constantine</div>
					<img class="second-slide" src=""
						alt="Second slide">
				</div>
				<div class="item">
				<div class="carousel-caption">University Constantine</div>
					<img class="third-slide" src=""
						alt="Third slide">
				</div>
			</div>

			
		</div>


	</div>
	<div class="col-lg-0"></div>
</div>
<br>
<br>
<br>
<br> 


 



</div>
<br>
<br>
<br>
<%@ include file="footer.html"%>
