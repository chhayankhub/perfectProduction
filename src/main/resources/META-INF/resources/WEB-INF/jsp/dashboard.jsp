<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Perfect Production</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">      
		<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="bootstrap/css/ppstyles.css" rel="stylesheet">
		<link href="themes/css/bootstrappage.css" rel="stylesheet"/>
		
		<!-- global styles -->
		<link href="themes/css/flexslider.css" rel="stylesheet"/>
		<link href="themes/css/main.css" rel="stylesheet"/>

		<!-- scripts -->
		<script src="themes/js/jquery-1.7.2.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>				
		<script src="themes/js/superfish.js"></script>	
		<script src="themes/js/jquery.scrolltotop.js"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
	</head>
    <body>		
		<jsp:include page="header.jsp" />
		<div id="wrapper" class="container homeclass" >
			<div class="row col-md-12 homepage">
			<div class="span6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Orders
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Username</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>Mark</td>
                                            <td>Otto</td>
                                            <td>@mdo</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>Larry</td>
                                            <td>the Bird</td>
                                            <td>@twitter</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
					<div class="panel panel-default">
                        <div class="panel-heading">
                            Quick Fabricator
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="container panelcontainer">
                                <form:form action="/fabricatorhome" method="post" modelAttribute="fabricatordto">
									<div class="form-group span3">
										<label>Name</label>
										<form:input class="form-control panelinput" path="name" placeholder="Enter name"></form:input>	
									</div>
									<div class="form-group span3">
										<label>Number</label>
										<form:input class="form-control panelinput" path="number" placeholder="Enter number"></form:input>	
									</div>
									<div class="form-group span3">
										<label>Username</label>
										<form:input class="form-control panelinput" path="username" placeholder="Enter username"></form:input>	
									</div>
									<div class="form-group span3">
										<label>Password</label>
										<form:input class="form-control panelinput" path="password" placeholder="Enter password"></form:input>	
									</div>
									<div class="form-group span3">
										<label>Address</label>
										<form:textarea class="form-control panelinput" path="address" placeholder="Enter address"></form:textarea>	
									</div>
									<div class="form-group span3">
										<label>Description</label>
										<form:textarea class="form-control panelinput" path="description" placeholder="Remark"></form:textarea>	
									</div>
									<div class="form-group span3">
										
										<input type="submit" class="btn formbtn btn-outline btn-success" value="Add"/>
									</div>
								</form:form>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                </div>
				<div class="span6">
                    <div class="panel panel-default ">
                        <div class="panel-heading">
                            Quick Order
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="">
							<form:form action="/quickorder" method="post" modelAttribute="orderdto" enctype="multipart/form-data">
								<div class="container panelcontainer">
										<div class="form-group span3">
                                            <label>Fabricator</label>
                                            <form:select class="form-control" path="fabricator" >
                                                <option>Select Fabricator</option>
                                                <c:forEach items="${fabricators}" var="asd">
                                                <option value="${asd.id}">${asd.name}</option>
                                                </c:forEach> 
                                            </form:select>
                                        </div>
								<div class="form-group span3">
                                            <label>Client</label>
                                            <form:select class="form-control" path="client">
                                                <option>Select Client</option>
                                                <c:forEach items="${clients}" var="client">
                                                <option value="${client.id}">${client.name}</option>
                                                </c:forEach>
                                            </form:select>
                                        </div>
								<div class="form-group span3">
                                            <label>Product</label>
                                            <form:input class="form-control panelinput" placeholder="Enter product" path="product"></form:input>
                                        </div>
								<div class="form-group span3">
                                            <label>Roll Type</label>
                                            <form:input class="form-control panelinput" placeholder="Enter type of roll" path="rolltype"></form:input>
                                        </div>
								<div class="form-group span3">
                                            <label>Rolls</label>
                                            <form:input class="form-control panelinput" placeholder="Enter number of roll" path="rolls"></form:input>
                                        </div>
								<div class="form-group span3">
                                            <label>File input</label>
                                            <form:input type="file" class="fileinput" path="design"></form:input>
                                        </div>
                                        <div class="form-group span3">
                                            <label>Remark</label>
                                            <form:textarea class="form-control panelinput" placeholder="Enter any Remark" path="remark"></form:textarea>
                                        </div>
                                        <div class="form-group span3">
										
										<input type="submit" class="btn formbtn btn-outline btn-success" value="Save"/>
									</div>
							</div>
						</form:form>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
				<div class="panel panel-default">
                        <div class="panel-heading">
                            Quick Clients
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Name</th>
                                            <th>Number</th>
                                            <th>Description</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${clients}" var="client">
                                               
                                        <tr>
                                            <td>${client.id}</td>
                                            <td>${client.name}</td>
                                            <td>${client.number}</td>
                                            <td>${client.description}</td>
                                        </tr>
                                        </c:forEach> 
                                     </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
			</div>
			<section class="our_client">
				<h4 class="title"><span class="text">Clients</span></h4>
				<div class="row">					
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/14.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/35.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/1.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/2.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/3.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/4.png"></a>
					</div>
				</div>
			</section>
<div class="span12">
<section id="copyright">
				<span>Copyright 2013 bootstrappage template  All right reserved.</span>
			</section>
</div>
			
		</div>
		<script src="themes/js/common.js"></script>
		<script src="themes/js/jquery.flexslider-min.js"></script>
		<script type="text/javascript">
			$(function() {
				$(document).ready(function() {
					$('.flexslider').flexslider({
						animation: "fade",
						slideshowSpeed: 4000,
						animationSpeed: 600,
						controlNav: false,
						directionNav: true,
						controlsContainer: ".flex-container" // the container that holds the flexslider
					});
				});
			});
		</script>
    </body>
</html>